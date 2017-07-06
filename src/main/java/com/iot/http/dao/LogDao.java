package com.iot.http.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/6/22.
 */
@Repository
public interface LogDao {

    int log(String message);
}
