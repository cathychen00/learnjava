import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.cathy.controller.CategoryController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;


/**
 * Created by 陈敬 on 2017/3/20.
 */
public class CategoryControllerTests {
    @Test
    public void testIndex(){
        CategoryController controller=new CategoryController();
        Assert.assertEquals("index",controller.index());
    }

    @Test
    public void testDetail() throws Exception {
        CategoryController controller=new CategoryController();
        MockMvc mockMvc= standaloneSetup(controller).build();
        mockMvc.perform(get("/category/detail"))
                .andExpect(view().name("detail"));
    }
}
