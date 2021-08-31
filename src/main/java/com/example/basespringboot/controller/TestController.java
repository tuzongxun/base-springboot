package com.example.basespringboot.controller;

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
	
	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
}
