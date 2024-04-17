package com.webapp.pojo;

import com.webapp.controller.Check;

public class UserParam {
    @Replace(source=" ",target="")
    private String id;

    @Check(paramIn ={"a","b"})
    private String name;
    private int age  ;

    public UserParam() {
    }

  @Override
  public String toString() {
    return "UserParam{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
