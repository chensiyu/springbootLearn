package com.springboot.learn.controller;

import com.springboot.learn.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: chensiyu3
 * Date: 2021/7/13
 * Time: 下午9:22
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class PersonController {

    @Autowired
    private Person person;

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return person;
    }
}
