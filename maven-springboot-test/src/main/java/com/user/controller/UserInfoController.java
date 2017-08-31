package com.user.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.UserInfo;
import com.user.service.UserInfoService;
import com.user.vo.UserInfoVO;

@RestController
//@EnableAutoConfiguration
@RequestMapping("/userInfo")
@MapperScan(basePackages={"com.user.mapper"})
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	@RequestMapping("/getUserInfo")
	public UserInfoVO getUserInfo (){
		UserInfoVO userInfo = new UserInfoVO();
		userInfo.setId(1345);
		userInfo.setUserName("ceshi");
		return userInfo;
	}
	@RequestMapping("/saveUserInfo")
	public void saveUserInfo(){
		UserInfo userInfo = new UserInfo();
		userInfo.setUserEmail("test@qq.com");
		userInfo.setUserKey("abc");
		userInfo.setUserName("abc");
		userInfo.setUserPassword("jjjj");
		userInfo.setUserPhoneNumber("13112345678");
		userInfoService.saveUserInfo(userInfo);
	}
	
//	public static void main(String[] args) {
//		SpringApplication.run(UserInfoController.class);
//	}
}
