import com.cathy.controller.CategoryController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


/**
 * Created by 陈敬 on 2017/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
@WebAppConfiguration()
public class CategoryControllerTests {

    @Test
    public void testIndex(){
        CategoryController controller=new CategoryController();
        Assert.assertEquals("index",controller.index());
    }

    //todo 未通过
    @Test
    public void testDetail() throws Exception {
        CategoryController controller=new CategoryController();
        MockMvc mockMvc= MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/category/index"))
                .andExpect(view().name("index"));
    }
}
