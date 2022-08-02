package com.disnoire.quaceatingschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuacEatingScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuacEatingScheduleApplication.class, args);
	}

}
