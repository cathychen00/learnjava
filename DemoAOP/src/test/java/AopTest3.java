import javaConfig.BeanConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.CategoryService3;

/**
 * Created by 陈敬 on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class AopTest3 {

    @Autowired
    CategoryService3 service;

    @Test
    public void testConfigAop(){
        service.add(100);
    }
}
