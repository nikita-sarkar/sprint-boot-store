package com.practice.store;

import com.practice.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var userService = context.getBean(UserService.class);
		var user = User.builder()
				.name("John")
				.password("password")
				.email("john@codewithmosh.com")
				.build();
		System.out.println(user);
	}

}
