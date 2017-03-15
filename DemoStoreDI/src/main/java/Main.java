import bean.Category;
import bean.Product;
import config.ProductConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 陈敬 on 2017/2/7.
 */
public class Main {
    public static void main(String[] args){

//        testXmlConfig();
        testJavaConfig();

    }

    //xml方式加载bean
    public static void testXmlConfig(){
        //创建Category bean实例
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Category category=applicationContext.getBean(Category.class);

        //输出默认值
        System.out.println(category.toString());

        //设置属性
        category.setCateId(1);
        category.setCateName("书籍");
        System.out.println(category.toString());

        //运行结果：
//        商品类型 id=99,name=其他
//        商品类型 id=1,name=书籍

        Product product=applicationContext.getBean(Product.class);
        System.out.println(product.toString());
    }

    //java config方式加载bean
    public static void testJavaConfig(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);
        Product product=context.getBean(Product.class);
        System.out.println(product.toString());
    }

}
