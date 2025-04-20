package com.practice.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${app.page-size}")
    private String appSize;

    @RequestMapping("/")
    public String index()
    {
        System.out.print("appSize: " + appSize);

        return "index.html";
    }
}
