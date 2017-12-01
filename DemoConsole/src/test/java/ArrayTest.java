import org.junit.Test;

import java.util.Arrays;

/**
 * @author 陈敬
 * @date 17/12/1
 */
public class ArrayTest {
    /**
     * 打印数组
     */
    @Test
    public void printArrayValue(){
        int[] a={1,3,5,7,9};
        System.out.println(Arrays.toString(a));
    }

    /**
     * 拷贝数组
     */
    @Test
    public void copyArray(){
        String[] a={"hello","world","!","array copy"};
        System.out.println(Arrays.toString(a));
        System.out.println(a);
        //拷贝数组引用
        String[] b=a;
        System.out.println(b);
        System.out.println(b.length);
        //拷贝数组值，长度为原数组2倍
        String[] c=Arrays.copyOf(a,a.length*2);
        System.out.println(c);
        System.out.println(c.length);
        //拷贝数组值，长度为原数组1/2
        String[] d=Arrays.copyOf(a,a.length/2);
        System.out.println(d);
        System.out.println(d.length);
    }

    /**
     * 快速排序
     */
    @Test
    public void sortArray(){
        int[] a={1,199,34,24,65,29,5,394,66};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
