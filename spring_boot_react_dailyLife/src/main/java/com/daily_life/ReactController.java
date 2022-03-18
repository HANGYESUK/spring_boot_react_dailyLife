package com.daily_life;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactController {
	
	@RequestMapping("hello")
	public String hello() {
		return "오늘 나의 일상";
	}
	
}
