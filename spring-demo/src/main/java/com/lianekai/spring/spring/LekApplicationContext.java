package com.lianekai.spring.spring;

import com.lianekai.spring.config.AppConfig;
import com.lianekai.spring.spring.annotation.ComponentScan;

/**
 * @author lianekai
 * @date 2022/5/28 20:54
 * @version: 1.0
 * @description 测试自己创建一个Spring容器，了解Spring原理
 */
public class LekApplicationContext {

    private Class configClass;

    public LekApplicationContext(Class appConfigClass) {
        this.configClass=appConfigClass;
        /**扫描 扫描路径 通过配置类拿到扫描路径*/
        /**判断有没有那个注解*/
        if(appConfigClass.isAnnotationPresent(ComponentScan.class)){
            ComponentScan componentScanAnnotation = (ComponentScan) appConfigClass.getAnnotation(ComponentScan.class);
            String scanPath=componentScanAnnotation.value();//拿到扫描路径 com.lianekai.service 这个是包名 实际要扫描service编译好以后的class文件
        }

    }

    public Object getBean(String name){
        return null;
    }

}
