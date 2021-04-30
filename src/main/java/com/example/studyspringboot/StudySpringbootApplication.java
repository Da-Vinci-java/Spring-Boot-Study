package com.example.studyspringboot;

import com.example.studyspringboot.entity.User;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//直接引入一个类，只能注入一个
//@Import(User.class)

//引入一个实现了ImportSelector接口的类，返回全类型数组，数组的类都可以引入，可以用resources创建text文件注入多个
//@Import(UserSelect.class)

//引入一个配置类，用配置的方式注入
@Import(UserConfiguration.class)
@SpringBootApplication
public class StudySpringbootApplication {

    public static void main(String[] args) { SpringApplication.run(StudySpringbootApplication.class, args);
    }

}
