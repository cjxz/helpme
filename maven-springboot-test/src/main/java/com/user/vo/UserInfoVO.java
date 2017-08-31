package com.user.vo;

import java.io.Serializable;

public class UserInfoVO implements Serializable {
	private static final long serialVersionUID = -2196483874807305068L;
	private Integer id;
	private String userName;
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
	
}
