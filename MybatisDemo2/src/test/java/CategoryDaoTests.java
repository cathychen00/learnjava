import com.data.mapper.CategoryMapper;
import com.data.pojo.Category;
import com.data.pojo.CategoryExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈敬 on 2017/2/22.
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryDaoTests {
    @Resource
    CategoryMapper categoryMapper;

    @Test
    public void test_selectById(){
        Category category=categoryMapper.selectByPrimaryKey(1);
        System.out.println(category.getName());//Fish

    }

    @Test
    public void test_count(){
        CategoryExample example=new CategoryExample();
        example.createCriteria().andNameEqualTo("Dogs");
        long result=categoryMapper.countByExample(example);
        System.out.println(result);
    }

    @Test
    public void test_insert(){
        Category category=new Category();
        category.setName("Test");
        int result=categoryMapper.insert(category);
        System.out.println(result);
    }
}

