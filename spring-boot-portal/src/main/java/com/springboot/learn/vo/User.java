package com.springboot.learn.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * User: chensiyu3
 * Date: 2021/7/10
 * Time: 下午9:24
 * To change this template use File | Settings | File Templates.
 * @date 2021-07-10 21:24
 * @author chensiyu3
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private String name;

    private Integer age;

    private Pet pet;
}
