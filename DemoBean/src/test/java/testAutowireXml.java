import bean.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath*:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class testAutowireXml {
    @Autowired
    private Category category;

    @Test
    public void categoryNotNull() {
        Assert.assertNotNull(category);
    }

    @Test
    public void testId(){
        Assert.assertEquals(100,category.getCateId());
    }
}
