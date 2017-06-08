import demoJPA.dao.CategoryDao;
import demoJPA.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.midi.Soundbank;
import javax.swing.text.StyledEditorKit;
import java.util.List;

/**
 * Created by 陈敬 on 2017/6/7.
 */
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class testJpa {

    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void testSave(){
        Category category=new Category();
        category.setId(5);
        category.setName("test1");
        categoryDao.save(category);
    }

    @Test
    public void testFindById(){
        Category category=categoryDao.findOne(5);
        System.out.println(category);
    }

    @Test
    public void count(){
        long count=categoryDao.count();
        System.out.println(count);
    }

    @Test
    public void testFindAll(){
        Iterable<Category> categories=categoryDao.findAll();
        for(Category category:categories){
            System.out.println(category);
        }
    }

    @Test
    public void delete(){
        int id=5;
        categoryDao.delete(id);
    }

}
