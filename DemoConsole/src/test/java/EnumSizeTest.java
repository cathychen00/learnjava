import org.junit.Test;

/**
 * @author 陈敬
 * @date 17/11/30
 */
public class EnumSizeTest {
    @Test
    public void test(){
        EnumSize small=EnumSize.SMALL;
        System.out.println(small.name());
        System.out.println(small.ordinal());

        EnumSize medium=EnumSize.MEDIUM;
        System.out.println(medium.name());
        System.out.println(medium.ordinal());
    }
}
