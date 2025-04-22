package com.practice.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
//		System.out.println(orderService);
//		var orderService2 = context.getBean(OrderService.class);
//		orderService2.placeOrder();
//		System.out.println(orderService2);
//		var heavyResource = context.getBean(HeavyResource.class);
		context.close();
	}

}
