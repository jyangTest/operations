package com.iot.http.service.impl;

import com.iot.common.util.DataWrapper;
import com.iot.common.util.TimeUtil;
import com.iot.http.dao.DeviceDao;
import com.iot.http.dao.mysql.LoadDataInStream;
import com.iot.http.dao.redis.RedisBase;
import com.iot.http.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/14.
 */
@Service
public class DataServiceImpl implements DataService {
    @Autowired
    RedisBase redisBase;
    @Autowired
    DeviceDao deviceDao;
    @Autowired
    LoadDataInStream loadDataInStream;

    @Override
    public DataWrapper<Void> saveAll() {

        String date = TimeUtil.getDate(new Date(), -1);
        Set<String> keys = redisBase.setOps().members("keys_device_run");

        for (String key : keys) {
            String tableName = "data_" + key;

            Set<String> values = redisBase.zSetOps().range("data_" + date + "_" + key,0,-1);
            List<String[]> datas = new ArrayList<>();
            String fieldName = "time,error,data";

            for (String value : values) {
                String[] temp = value.split(":");
                temp[0] = date + temp[0];

                datas.add(temp);
            }
            loadDataInStream.write(tableName, datas, fieldName);
        }
        getRunDevice();
        return null;
    }

    private void getRunDevice() {
        redisBase.getRedisTemplate().delete("keys_device_run");
        Set<String> runningDevices = redisBase.setOps().members("keys_device_running");
        for (String device : runningDevices) {
            redisBase.setOps().add("keys_device_run", device);
        }
    }
}
