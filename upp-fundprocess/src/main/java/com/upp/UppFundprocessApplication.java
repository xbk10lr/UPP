package com.upp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.upp.dao")
public class UppFundprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(UppFundprocessApplication.class, args);
	}
}
