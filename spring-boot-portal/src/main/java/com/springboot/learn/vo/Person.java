package com.springboot.learn.vo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: chensiyu3
 * Date: 2021/7/13
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 * @date 2021-07-13 21:09
 * @author chensiyu3
 */
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;

}
