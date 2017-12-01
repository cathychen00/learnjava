import org.junit.Test;

/**
 * @author 陈敬
 * @date 17/12/1
 */
public class ParamTest {
    @Test
    public void testChangeNum(){
        Letter a=new Letter(11);
        a.change(22);
        a.show();
    }

    @Test
    public void testSwap(){
        Letter a=new Letter(1);
        Letter b=new Letter(2);
        a.show();
        b.show();
        Letter.swap(a,b);//不能交换成功
        a.show();
        b.show();
    }
}
