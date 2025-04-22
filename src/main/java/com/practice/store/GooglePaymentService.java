package com.practice.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("google")
public class GooglePaymentService implements PaymentService {

    @Value("${google.apiUrl}")
    private String apiUrl;

    @Value("${google.supportedCurrencies}")
    private String supportedCurrencies;

    @Override
    public void processPayment(double amount)
    {
        System.out.println("GOOGLE PAY");
        System.out.println("Amount: " + amount);
        System.out.println("API URL: " + apiUrl);
        System.out.println("Supported Currencies: " + supportedCurrencies);
    }
}
