package com.iot.http.dao;


import org.springframework.stereotype.Repository;

import com.iot.http.entity.AlarmEntity;

/**
 * Created by XiaoJiang01 on 2017/4/21.
 */
@Repository
public interface AlarmDao {
    AlarmEntity getAddress(int deviceId);

    int add(AlarmEntity alarmEntity);

    void updateEndTime(int id);
}
