import com.data.mapper.ProductMapper;
import com.data.pojo.Product;
import com.data.pojo.ProductExample;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈敬 on 2017/2/24.
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductDaoTests {
    @Resource
    ProductMapper productMapper;

    @Test
    public void test_selectByPrimaryKey(){
        Product product=productMapper.selectByPrimaryKey(1);
        System.out.println(product.getName());
    }

    @Test
    public void test_page(){
        int id=2;
        int pageIndex=1,pageSize=3;
        RowBounds rowBounds=new RowBounds((pageIndex-1)*pageSize,pageSize);

        ProductExample example=new ProductExample();
        example.createCriteria().andCategoryidEqualTo(2);
        List<Product> products=productMapper.selectByExampleWithRowbounds(example,rowBounds);
        if(products==null){
            System.out.println("查询结果为空");
        }else {
            System.out.println("第"+pageIndex+"页，每页大小"+pageSize);
            for(Product p:products){
                System.out.println("id="+p.getId()+" name="+p.getName());
            }
        }
    }
}
