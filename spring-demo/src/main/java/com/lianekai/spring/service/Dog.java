package com.lianekai.spring.service;

/**
 * @author lianekai
 * @date 2022/5/30 23:10
 * @version: 1.0
 * @description TODO
 */

public class Dog {
    private String name;

    private Integer age;

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(Integer age){
         this.age=age;
    }


}
