package com.webapp.controller;

import org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;


public class ParamConstraintValidated implements ConstraintValidator<Check, Object> {
   /**
    * 合法的参数值，从注解中获取
    * */
   private List<String> paramValues;

   private HttpEncodingAutoConfiguration configuration;
   @Override
   public void initialize(Check constraintAnnotation) {
      //初始化时获取注解上的值
      paramValues = Arrays.asList(constraintAnnotation.paramIn());
   }

   @Override
   public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
      System.out.println(paramValues.toString());


      System.out.println("====print===");
      return paramValues.contains(o);
   }
}
//public class ParamConstraintValidated implements ConstraintValidator<Check, String> {
//   public void initialize(Check constraint) {
//   }
//
//   public boolean isValid(String obj, ConstraintValidatorContext context) {
//      return false;
//   }
//}
