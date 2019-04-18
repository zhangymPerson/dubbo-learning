package com.danao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang
 * @version 1.0
 * @classname HelloController
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/18
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(value = "/test")
	public String hello(){
		return "hello!";
	}
}
