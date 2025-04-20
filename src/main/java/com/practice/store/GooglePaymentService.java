package com.practice.store;

import org.springframework.stereotype.Service;

@Service
public class GooglePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount)
    {
        System.out.println("GOOGLE PAY");
        System.out.println("Amount: " + amount);
    }
}
