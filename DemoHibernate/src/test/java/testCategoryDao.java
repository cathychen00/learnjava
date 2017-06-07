import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 陈敬 on 2017/6/6.
 */
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class testCategoryDao {
    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void testAdd() {
        Category category = new Category();
        category.setCateId(4);
        category.setCateName("母婴");

        categoryDao.save(category);
    }

    @Test
    public void testUpdate() {
        Category category = new Category();
        category.setCateId(4);
        category.setCateName("男装");

        categoryDao.update(category);
    }


    @Test
    public void testGetById() {
        int id = 4;
        Category category = categoryDao.getById(id);

        if(category==null){
            System.out.println("not exist");
        }else {
            System.out.println(category.toString());
        }
    }

    @Test
    public void testGetAll() {
        List<Category> categories = categoryDao.getAll();
        for (Category item : categories) {
            System.out.println(item);
        }
    }

    @Test
    public void testCount() {
        int count = categoryDao.count();
        System.out.println(count);
    }

    @Test
    public void testDelete() {
        int id = 4;
        categoryDao.delete(id);
    }
}
