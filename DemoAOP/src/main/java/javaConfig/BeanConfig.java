package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import service.CategoryService3;

/**
 * Created by 陈敬 on 2017/3/17.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class BeanConfig {

    @Bean
    public CategoryService3 service(){
        return new CategoryService3();
    }
}
