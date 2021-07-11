package com.springboot.learn.controller;

import com.springboot.learn.vo.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: chensiyu3
 * Date: 2021/7/10
 * Time: 上午11:36
 * To change this template use File | Settings | File Templates.
 * @date 2021-07-10 11:36
 * @author chensiyu3
 */
@RestController
public class HelloController {

    @Resource
    private Car car;

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot 2!" + "你好！才怪！";
    }

    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
