package autowire.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 陈敬 on 2017/3/15.
 */
@Configuration
//@ComponentScan(basePackages ="autowire.bean")
@ComponentScan(basePackageClasses = {autowire.bean.Category1.class,autowire.bean.Product1.class})
public class ProductConfig {

}
