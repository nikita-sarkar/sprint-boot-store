package com.practice.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{

    @Value("${email.host}")
    private String host;

    @Value("${email.port}")
    private String port;

    @Override
    public void send(String message, String recipientEmail)
    {
        System.out.println("Sending email");
        System.out.println(host);
        System.out.println(port);
        System.out.println(message);
    }
}
