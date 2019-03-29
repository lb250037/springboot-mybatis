package com.example.demo.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {
	private Integer id;
	private String name;
	private String sex;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	@Value("${name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	public User(Integer id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public User() {
		super();
	}
}
