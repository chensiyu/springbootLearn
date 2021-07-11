package com.springboot.learn;

import com.springboot.learn.config.MyConfig;
import com.springboot.learn.vo.Pet;
import com.springboot.learn.vo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chensiyu3
 * Date: 2021/7/10
 * Time: 上午11:31
 * To change this template use File | Settings | File Templates.
 */

/**
 * SpringBootApplication注解: 这是一个springboot应用
 * @date 2021-07-10 11:33
 * @author chensiyu3
 */
@SpringBootApplication
public class MainApplication {

    /**
     * springboot启动
     * @param args
     */
    public static void main(String[] args) {
        //1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2.查看容器里组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }

        //3.从容器里获取组件
        Pet tom1 = run.getBean("tomcatPet", Pet.class );
        Pet tom2 = run.getBean("tomcatPet", Pet.class);

        System.out.println("组件：" + (tom1 == tom2));

        MyConfig bean = run.getBean(MyConfig.class);

        User user = bean.user01();
        User user1 = bean.user01();

        System.out.println(user == user1);

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tomcatPet", Pet.class);

        System.out.println(user01.getPet() == tom);

        boolean user2 = run.containsBean("user");
        boolean pet = run.containsBean("pet");

        System.out.println("是否包含user：" + user2 + "，是否包含pet：" + pet);
    }
}
