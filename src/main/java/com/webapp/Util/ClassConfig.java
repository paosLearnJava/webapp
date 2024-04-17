package com.webapp.Util;

import com.webapp.pojo.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.webapp.pojo")
public class ClassConfig {
    @Bean //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    public UserEntity user(){
        return new UserEntity();
    }
}