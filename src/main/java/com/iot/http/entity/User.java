package com.iot.http.entity;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class User {
	private int id;
	private String userName;
	private String password;
	private Date registerDate;
	private String realName;
	private String email;
	private String tel;
	private int userType;
	public User(){
		
	}
	public User(int id, String userName, String password, Date registerDate, String realName, String email, String tel,
			int userType) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.registerDate = registerDate;
		this.realName = realName;
		this.email = email;
		this.tel = tel;
		this.userType = userType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	

}
