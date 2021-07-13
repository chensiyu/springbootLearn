package com.springboot.learn.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * User: chensiyu3
 * Date: 2021/7/10
 * Time: 下午9:31
 * To change this template use File | Settings | File Templates.
 * @date 2021-07-10 21:32
 * @author chensiyu3
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet {

    private String name;
    private Double weight;
}
