package com.example.demo;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.Userserver;

@RestController
@RequestMapping()
public class Mycontroller {
	@Autowired
	private Userserver us;
	
	@ResponseBody
	@RequestMapping("/tee/{id}")
	public void get(@PathVariable("id")Integer id) {
		System.out.println("path1= "+id);
		System.out.println("path1= ");
	}
	
	@RequestMapping("/tee2/{id}")
	public void get1(@PathVariable("id")Integer id) {
		System.out.println("path2= "+id);
		System.out.println("path2= ");
	}
	
	@RequestMapping("/all")
	@ResponseBody
	public List<User> getall() {
		return us.getall();
	}
}
