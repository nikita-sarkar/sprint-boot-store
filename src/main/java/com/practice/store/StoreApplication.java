package com.practice.store;

import com.practice.store.entities.Address;
import com.practice.store.entities.Profile;
import com.practice.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var userService = context.getBean(UserService.class);

//		var address = Address.builder()
//				.street("street")
//				.city("city")
//				.state("state")
//				.zip("zip")
//				.build();
//
//		user.addAddress(address);
//		user.addTag("tag1");
//
//		var profile = Profile.builder()
//				.bio("bio")
//				.build();
//
//		user.setProfile(profile);
//		userService.persistRelated();
//		userService.demoFetch();

		//userService.deleteRelated();
		userService.setNewPassword("xyz");

	}

}
