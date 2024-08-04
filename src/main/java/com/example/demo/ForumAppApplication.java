package com.example.demo;

import com.example.demo.Models.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class ForumAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumAppApplication.class, args);
	}



	@Bean
	public Message initMessage(){

		log.info("pipeline start !!!");
		return new Message();
	}
}
