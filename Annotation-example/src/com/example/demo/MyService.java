package com.example.demo;

import com.example.demo.stereotype.MyBean;
@MyBean(scope="singleton",name="student")
public class MyService {
	@MyBean(scope="request",name="vidyarthi")
	public String show()
	{
		return "Hello";
	}
}
