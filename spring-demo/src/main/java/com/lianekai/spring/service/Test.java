package com.lianekai.spring.service;

import com.lianekai.spring.config.AppConfig;
import com.lianekai.spring.spring.LekApplicationContext;

/**
 * @author lianekai
 * @date 2022/5/28 20:55
 * @version: 1.0
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        LekApplicationContext applicationContext=new LekApplicationContext(AppConfig.class);
        UserService userService= (UserService) applicationContext.getBean("userService");
    }
}
