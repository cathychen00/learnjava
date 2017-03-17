import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CategoryService1;
import service.CategoryService2;

/**
 * Created by 陈敬 on 2017/3/17.
 */

public class AopTest1 {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aop1.xml");

        CategoryService1 service1=context.getBean(CategoryService1.class);
        service1.add(1);
    }
}

