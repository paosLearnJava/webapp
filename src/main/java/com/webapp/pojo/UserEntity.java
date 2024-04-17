package com.webapp.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserEntity  implements userService {
    @Value("   1   ")
    private  String id;
    @Value("a")
    private String name;

    @Override
    public void Crazy() {
        System.out.println(name + "crazy "+id+" years");
    }
}
