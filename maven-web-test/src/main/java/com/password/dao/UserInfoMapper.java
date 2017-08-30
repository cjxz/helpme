package com.password.dao;


import java.util.List;

import com.password.vo.UserInfo;

public interface UserInfoMapper {
	List<UserInfo> findAll();
    int insert(UserInfo record);
}