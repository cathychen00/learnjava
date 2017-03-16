import autowire.bean.Category1;
import autowire.bean.Product1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 陈敬 on 2017/3/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = autowire.config.ProductConfig.class)
public class testAutowireJavaConfig {
    @Autowired
    Category1 category;
    @Test
    public void testCategory(){
        Assert.assertNotNull(category);
    }

    @Autowired
    Product1 product;
    @Test
    public void testProduct(){
        Assert.assertNotNull(product);
        System.out.println(product.toString());
    }
}
