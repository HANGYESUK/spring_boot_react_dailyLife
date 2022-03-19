package com.daily_life;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.daily_life"})
@MapperScan(basePackages = {"com.daily_life"})
public class SpringBootReactDailyLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactDailyLifeApplication.class, args);
	}

}
