package com.lianekai.spring.test;

import com.lianekai.spring.service.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lianekai
 * @date 2022/5/30 23:15
 * @version: 1.0
 * @description 测试
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        Dog dog= (Dog) applicationContext.getBean("dog");
        System.out.println(dog);
    }
}
