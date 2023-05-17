package com.cybersoft.demospringboot21.config;


import com.cybersoft.demospringboot21.model.UserModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration thông báo cho spring boot biết khi chạy ở tầng config thì phải quét và cấu hình
@Configuration
public class CustomConfig {

    @Bean
    public UserModel userModel () {
        UserModel userModel = new UserModel();
        userModel.setUserName("Nguyen Van A");
        userModel.setPassword("123456");

        return userModel;
    }
}
