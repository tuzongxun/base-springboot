package com.example.basespringboot.service;

import org.springframework.stereotype.Service;

/**
 * @Author tuzongxun
 * @Date 2021/9/1
 */
@Service
public class TestService {

	public String hello(String name){
		return "hello:"+name;
	}
}
