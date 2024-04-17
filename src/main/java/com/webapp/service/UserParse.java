package com.webapp.service;

import com.webapp.pojo.Replace;
import com.webapp.pojo.userService;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

@Service
public class UserParse {


    public Object parser(Object o){
        Class<?> mClass =null;
        try{
            mClass=o.getClass();
            Field[] fields=mClass.getDeclaredFields();
            for(Field field:fields){
                if(field.isAnnotationPresent(Replace.class)){
                    field.setAccessible(true);
                    Replace myAnno =field.getAnnotation(Replace.class);
                    String s=myAnno.source();
                    String t =myAnno.target();

                    String fvalue=String.valueOf(field.get(o));
                    String ret=fvalue.replace(s,t);
                    field.set(o,ret);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }
}
