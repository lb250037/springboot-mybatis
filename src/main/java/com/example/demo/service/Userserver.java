package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;

@Service
public class Userserver {
	@Autowired
	private UserMapper  um;
	
	public List<User> getall(){
		return um.getall();
	}
	
	public void insert(User user) {
		
		um.insertUser(user);
	}
}
