import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pointcut.LogHandler;
import service.CategoryService1;
import service.CategoryService2;

/**
 * Created by 陈敬 on 2017/3/7.
 */
public class AopTests {

    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aop.xml");

        CategoryService1 service1=context.getBean(CategoryService1.class);
        service1.add(1);

        CategoryService2 service2=context.getBean(CategoryService2.class);
        service2.add(2);

//        LogHandler logHandler=context.getBean(LogHandler.class);
//        logHandler.log();
    }
}
