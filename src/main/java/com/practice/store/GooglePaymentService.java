package com.practice.store;

public class GooglePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount)
    {
        System.out.println("GOOGLE PAY");
        System.out.println("Amount: " + amount);
    }
}
