package config;

import bean.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 陈敬 on 2017/5/17.
 */
@Configuration
public class JavaConfig {
    @Bean
    public Category category(){
        return new Category();
    }
}
