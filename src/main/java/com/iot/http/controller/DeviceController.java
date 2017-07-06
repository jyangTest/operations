package com.iot.http.controller;

import com.iot.common.util.DataWrapper;
import com.iot.http.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by XiaoJiang01 on 2017/3/14.
 */
@Controller
@RequestMapping("api/device")
public class DeviceController {
    @Autowired
    DeviceService deviceService;

    @RequestMapping(value = "startDevice", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> start(
            @RequestParam String groupId
    ) {
        List<String> groupIds = new ArrayList<>();
        groupIds.add(groupId);
        DataWrapper<Void> dataWrapper = deviceService.start(groupIds);
        return dataWrapper;
    }

    @RequestMapping(value = "closeDevice", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> close(
            @RequestParam String groupId
    ) {
        List<String> groupIds = new ArrayList<>();
        groupIds.add(groupId);
        return deviceService.close(groupIds);
    }
}
