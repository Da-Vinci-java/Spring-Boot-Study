package com.example.studyspringboot;

import com.example.studyspringboot.entity.Cat;
import com.example.studyspringboot.entity.User;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;

public class UserConfiguration {

    @Bean
    public User user(Cat cat){
        User user = new User();
        user.setCat(cat);
        return user;
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }
}
