package com.lianekai.spring.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lianekai
 * @date 2022/5/28 20:58
 * @version: 1.0
 * @description TODO
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //表示这个注解只能用在类上面
public @interface ComponentScan {
    String value() default "";//只等扫描路径
}
