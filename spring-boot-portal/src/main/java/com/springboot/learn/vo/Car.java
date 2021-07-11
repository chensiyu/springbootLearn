package com.springboot.learn.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chensiyu3
 * Date: 2021/7/11
 * Time: 上午11:31
 * To change this template use File | Settings | File Templates.
 * @date 2021-07-11 11:31
 * @author chensiyu3
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@ConfigurationProperties(prefix = "mycar")
@Component
public class Car {

    private String brand;

    private Integer price;
}
