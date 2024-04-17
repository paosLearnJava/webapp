package com.webapp.controller;

import com.webapp.pojo.Replace;
import com.webapp.pojo.UserParam;
import com.webapp.service.UserParse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.io.BufferedInputStream;
import java.net.URL;


@RestController
public class UserController {

    @RequestMapping("/hello")
    public Object  UserHello( @RequestBody @Valid UserParam Param){
        return "hello world";
    }
    @RequestMapping("/hello2")
    public Object  UserHello2( @RequestBody  UserParam Param){
        System.out.println(Param.toString());
        return "hello world";
    }

}
