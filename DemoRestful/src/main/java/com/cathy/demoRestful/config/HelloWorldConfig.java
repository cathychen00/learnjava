package com.cathy.demoRestful.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author 陈敬
 * @date 17/11/7
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.cathy.demoRestful.controller")
public class HelloWorldConfig {
}
