package com.iot.http.service.impl;

import com.iot.common.enums.CallStatusEnum;
import com.iot.common.enums.ErrorCodeEnum;
import com.iot.common.util.DataWrapper;
import com.iot.http.dao.UserDao;
import com.iot.http.dao.mysql.LoadDataInStream;
import com.iot.http.dao.redis.RedisBase;
import com.iot.http.entity.User;
import com.iot.http.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    RedisBase redisBase;
    @Autowired
    UserDao userDao;
    @Autowired
    LoadDataInStream loadDataInStream;
   
   

	@Override
	public DataWrapper<List<User>> getUserList() {
		DataWrapper<List<User>> userList = new DataWrapper<List<User>>();
		userList.setData(userDao.getUserList());
		return userList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public DataWrapper<Void> addUser(final User user) {
		//redisBase.getConnection();
		//redisBase.setOps().add("name", "徐雨祥");
		//redisBase.valueOps().get("name");
		// TODO Auto-generated method stub
		DataWrapper<Void> bool = new DataWrapper<Void>();
		boolean flag;
		user.setRegisterDate(new Date(System.currentTimeMillis()));
		redisBase.bValueOps(user.getUserName());
		flag=userDao.addUser(user);
		if(flag!=false){
			bool.setCallStatus(CallStatusEnum.SUCCEED);
		}
		return bool;
	}

	@Override
	public DataWrapper<User> login(String userName, String password) {
		DataWrapper<User> dataWrapper = new DataWrapper<User>();
		User user = new User();
		user.setPassword(password);
		user.setUserName(userName);
		if(userDao.login(user)!=null){
			dataWrapper.setErrorCode(ErrorCodeEnum.No_Error);
		}else{
			dataWrapper.setErrorCode(ErrorCodeEnum.Login_Error);
		}
		return dataWrapper;
	}
}
