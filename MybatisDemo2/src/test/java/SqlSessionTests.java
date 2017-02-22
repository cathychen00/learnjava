import com.data.mapper.CategoryMapper;
import com.data.pojo.Category;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 陈敬 on 2017/2/21.
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SqlSessionTests {
    @Autowired
    private SqlSession sqlSession;

    @Test
    public void testSqlSession(){
        CategoryMapper categoryMapper= sqlSession.getMapper(CategoryMapper.class);
        Category category= categoryMapper.selectByPrimaryKey(1);
        if(category==null){
            System.out.println("Do not exist");
        }
        else{
            System.out.println(category.getName());
        }
    }
}
