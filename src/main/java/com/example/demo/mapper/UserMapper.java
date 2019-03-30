package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.pojo.User;

@Mapper
public interface UserMapper {
	
	public List<User> getall();
	
	public void insertUser(@RequestBody User user);
}
