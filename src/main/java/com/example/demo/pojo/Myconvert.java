package com.example.demo.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableWebMvc
@Component
public class Myconvert implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		System.out.println("call myconvert");;
		SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
