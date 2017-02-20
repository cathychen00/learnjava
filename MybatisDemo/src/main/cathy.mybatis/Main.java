import demo.ICategoryMapper;
import demo.MybatisUtils;
import model.Category;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by 陈敬 on 2017/2/20.
 */
public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        try{

            ICategoryMapper categoryMapper=sqlSession.getMapper(ICategoryMapper.class);
            Category category=categoryMapper.GetById(2);
            if(category==null){
                System.out.println("该分类不存在");
            }
            else{
                System.out.println(category.toString());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
