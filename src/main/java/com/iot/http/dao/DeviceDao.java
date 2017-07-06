package com.iot.http.dao;

import com.iot.common.util.Command;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by XiaoJiang01 on 2017/3/14.
 */
@Repository
public interface DeviceDao {

    String getPort(String groupId);

    List<Command> getCommands(String groupId);

    Command getCommand(String deviceId);

    List<String> getAddress(int termId);

    int getId(@Param("port") String port, @Param("number") String number);

    List<String> getRunningGroup();

    int getCount(String termId);

    int getType(String termId);

    int getTermId(int deviceId);

    int exception(@Param("port") String port, @Param("number") String number);

    String getPortByDevice(String deviceId);

    int getBit(int deviceId);

    int getBitByType(String type);

    Map<String, Integer> getDataInfo(@Param("port") String port, @Param("number") String number);
}