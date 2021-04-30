package com.example.studyspringboot.config;

import com.example.studyspringboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .order(1);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //addResourceHandler为资源映射，addResourceLocations为具体路径
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/img/");
        //多个资源引入方式，"file:D:/img/"为引用硬盘路径资源
        registry.addResourceHandler("/img/**").addResourceLocations("file:D:/img/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //注册跨域，跨域位置为api下所有类和方法
        registry.addMapping("/api/**").
                //允许谁跨域"http://127.0.0.1:5500"
                allowedOrigins("http://127.0.0.1:5500");
        //允许所有人跨域public
        registry.addMapping("/public/**").
                        allowedOrigins("*");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //添加一个视图解析器，先添加路径“/xxx"然后.具体的页面或者jsp
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("index");
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    }
}
