package com.upp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class UppScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UppScheduleApplication.class, args);
	}
}
