import com.data.mapper.CategoryMapper;
import com.data.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 陈敬 on 2017/2/22.
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryDaoTests extends AbstractJUnit4SpringContextTests {
    @Resource
    CategoryMapper categoryMapper;

    @Test
    public void test_select(){
        Category category=categoryMapper.selectByPrimaryKey(1);
        System.out.println(category.getName());

    }
}
