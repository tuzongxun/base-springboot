package com.example.basespringboot.controller;

import com.example.basespringboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tuzongxun
 * @Date 2021/8/31
 */
@RestController
@RequestMapping
public class TestController {

	@Autowired
	private TestService testService;
	
	@GetMapping("/hello")
	public String hello(String name){
		return testService.hello(name);
	}
}
