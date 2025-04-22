package com.practice.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//if i don't put lazy, i can see that it creates orderservice and heavyresource and then places the order
//but if i put lazy, it creates the resource at the end
@Component
@Lazy
public class HeavyResource {
    public HeavyResource()
    {
        System.out.println("Heavy Resource created");
    }
}
