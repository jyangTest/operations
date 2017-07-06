package com.iot.http.controller;

import com.iot.common.util.DataWrapper;
import com.iot.http.entity.User;
import com.iot.http.service.UserService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XiaoJiang01 on 2017/4/28.
 */
@Controller
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    @ResponseBody
    public DataWrapper<List<User>> getUserList(){
        return userService.getUserList();
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addUser(@ModelAttribute User user){
        return userService.addUser(user);
    }
    @RequestMapping(value="/login", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<User> Login(
    		HttpServletRequest request,
    		@RequestParam(value="userName",required=true) String userName,
    		@RequestParam(value="password",required=true) String password
    		) {
		DataWrapper<User> test=userService.login(userName, password);
		return test;
    }
}
