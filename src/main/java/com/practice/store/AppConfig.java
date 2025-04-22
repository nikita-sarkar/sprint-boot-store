package com.practice.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${payment.gateway}")
    private String paymentGateway;

    @Bean
    public PaymentService paypal()
    {
        return new PaypalPaymentService();
    }

    @Bean
    public PaymentService google()
    {
        return new GooglePaymentService();
    }

    @Bean
    public OrderService orderService()
    {
        if(paymentGateway.equals("google"))
        {
            return new OrderService(google());
        }
        else
        {
            return new OrderService(paypal());
        }
    }
}
