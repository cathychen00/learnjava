package config;

import bean.Category;
import bean.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 陈敬 on 2017/3/15.
 */
@Configuration
public class ProductConfig {

    @Bean
    public Product product(){
        return new Product(9999,"其他",category());
    }

    @Bean
    public Category category(){
        return new Category(9999,"其他");
    }
}
