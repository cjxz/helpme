package com.user.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.vo.UserInfoVO;

@RestController
//@EnableAutoConfiguration
@RequestMapping("/userInfo")
public class UserInfoController {
	@RequestMapping("/getUserInfo")
	public UserInfoVO getUserInfo (){
		UserInfoVO userInfo = new UserInfoVO();
		userInfo.setId(1345);
		userInfo.setUserName("ceshi");
		return userInfo;
	}
	
//	public static void main(String[] args) {
//		SpringApplication.run(UserInfoController.class);
//	}
}
