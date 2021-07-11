package com.springboot.learn.config;

import com.springboot.learn.vo.Pet;
import com.springboot.learn.vo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * proxyBeanMethods:代理bean 默认true 如果false，则不使用代理类。
 *      full(proxyBeanMethods = true)
 *      lite(proxyBeanMethods = false)
 *      解决组件依赖场景
 * @date 2021-07-10 21:35
 * @author chensiyu3
 */
@Configuration(proxyBeanMethods = true)
@ImportResource("classpath:spring-beans.xml")
public class MyConfig {

    @Bean
    public User user01(){
        return new User("zhangsan", 18, tomcatPet());
    }

    @Bean
    public Pet tomcatPet(){
        return new Pet("tomcatPet");
    }
}
