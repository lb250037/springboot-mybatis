package com.example.demo.pojo;








import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.InitBinder;


public class User {
	private Integer id;
	private String name;
	private String sex;
	
	
//	@DateTimeFormat(pattern="yyyy-MM-dd  hh:mm:ss")
	private Date name1;


	public Date getName1() {
		return name1;
	}

	public void setName1(Date name1) {
		this.name1 = name1;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
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
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", date=" + name1 + "]";
	}

	
	public User() {
	}
}
