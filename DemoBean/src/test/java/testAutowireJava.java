import bean.Category;
import config.BeanConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 陈敬 on 2017/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class testAutowireJava {
    @Autowired
    private Category category;

    @Test
    public void categoryNotNull() {
        Assert.assertNotNull(category);
    }
}
