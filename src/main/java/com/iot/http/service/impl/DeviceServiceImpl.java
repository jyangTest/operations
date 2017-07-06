package com.iot.http.service.impl;

import com.iot.common.util.Command;
import com.iot.common.util.DataWrapper;
import com.iot.http.dao.DeviceDao;
import com.iot.http.dao.ServerDao;
import com.iot.http.dao.redis.RedisBase;
import com.iot.http.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by XiaoJiang01 on 2017/3/14.
 */
@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceDao deviceDao;
    @Autowired
    ServerDao serverDao;
    @Autowired
    RedisBase redisBase;

    @Override
    public DataWrapper<Void> start(List<String> groupIds) {
        DataWrapper<Void> dataWrapper = new DataWrapper<>();
        String port = deviceDao.getPort(groupIds.get(0));
        List<Command> commands = deviceDao.getCommands(groupIds.get(0));
        read(port, commands);
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> close(List<String> groupIds) {
        DataWrapper<Void> dataWrapper = new DataWrapper<>();
        String port = deviceDao.getPort(groupIds.get(0));

        Set<String> runningDevices = redisBase.setOps().members("keys_device_running");
        for (String device : runningDevices) {
            if (device.indexOf(port) != -1){
                redisBase.setOps().remove("keys_device_running", device);
            }
        }
        return dataWrapper;
    }

    private void read(String port, List<Command> commands) {
        for (Command command : commands) {
            switch (command.getType()) {
                case 1:
                    command.autoCode();
                    break;
                case 2:
                    command.setAddress(deviceDao.getAddress(command.getTermId()));
                    command.addressCode();
                    break;
                default:
                    command.autoCode();
                    break;
            }
            redisBase.setOps().add("keys_device_running", port + "#" + command.getNumber());
            redisBase.setOps().add("keys_device_run", port + "#" + command.getNumber());
        }

    }
}
