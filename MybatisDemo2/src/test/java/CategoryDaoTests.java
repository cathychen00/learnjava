import com.data.dto.CategoryDto;
import com.data.mapper.CategoryMapper;
import com.data.pojo.Category;
import com.data.pojo.CategoryExample;
import com.data.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

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
        long result=categoryMapper.countByExample(example);
        System.out.println(result);
    }

    @Test
    public void test_insert(){
        System.out.println("before insert:count "+categoryMapper.countByExample(new CategoryExample()));

        Category category=new Category();
        category.setName("Test");
        categoryMapper.insert(category);

        System.out.println("after insert:count "+categoryMapper.countByExample(new CategoryExample()));

    }

    @Test
    public void test_delete(){
        System.out.println("before insert:count "+categoryMapper.countByExample(new CategoryExample()));

        CategoryExample example=new CategoryExample();
        example.createCriteria().andNameEqualTo("Test");
        int result=categoryMapper.deleteByExample(example);
        System.out.println("删除条数："+result);

        System.out.println("after insert:count "+categoryMapper.countByExample(new CategoryExample()));

    }

    @Test
    public void test_getById(){
        int id=2;
        CategoryDto dto= categoryMapper.getById(id);
        if(dto==null){
            System.out.println("不存在");
        }else {

            System.out.println("商品id="+dto.getId()+" name="+dto.getCategory().getName());
            System.out.println("Products："+dto.getProducts().size());
            for(Product product:dto.getProducts()){
                System.out.println("    |_"+product.getName());
            }
        }

    }
}
