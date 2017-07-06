package com.iot.http.service;


import java.util.List;

import com.iot.common.util.DataWrapper;
import com.iot.http.entity.User;

/**
 * Created by Administrator on 2017/6/14.
 */
public interface UserService {
	DataWrapper<List<User>> getUserList();

	DataWrapper<Void> addUser(User user);

	DataWrapper<User> login(String userName, String password);
}
