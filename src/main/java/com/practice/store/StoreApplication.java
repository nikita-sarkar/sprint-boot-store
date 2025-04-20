package com.practice.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		OrderService orderService = new OrderService(new GooglePaymentService());
		orderService.placeOrder();
		SpringApplication.run(StoreApplication.class, args);
	}

}
