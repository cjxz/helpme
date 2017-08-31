package com.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.UserInfo;
import com.user.mapper.UserInfoMapper;
import com.user.service.UserInfoService;
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	public void saveUserInfo(UserInfo userInfo) {
		userInfoMapper.insertSelective(userInfo);
	}

}
