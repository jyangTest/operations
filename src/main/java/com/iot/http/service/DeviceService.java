package com.iot.http.service;


import com.iot.common.util.DataWrapper;

import java.util.List;
import java.util.Map;

/**
 * Created by XiaoJiang01 on 2017/3/14.
 */
public interface DeviceService {
    DataWrapper<Void> start(List<String> groupIds);

    DataWrapper<Void> close(List<String> groupIds);
}
