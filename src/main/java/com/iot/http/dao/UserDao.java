package com.iot.http.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.iot.http.entity.User;
import com.iot.common.util.DataWrapper;
import com.iot.http.dao.UserDao;

/**
 * Created by XiaoJiang01 on 2017/4/21.
 */
@Repository
public interface UserDao {
	List<User> getUserList();

	boolean addUser(User user);
	
	User login(User user);
}
