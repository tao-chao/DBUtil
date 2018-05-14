package com.znsd.mybatis.bean;

public class UserBean {
	private Integer id;
	private String userName;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	public UserBean(Integer id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	
}
