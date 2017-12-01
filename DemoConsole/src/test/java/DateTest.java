import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author 陈敬
 * @date 17/12/1
 */
public class DateTest {
    @Test
    public void testDate(){
        Date date= new Date();
        System.out.println(date);
        //getYear，不是返回当前年份
        System.out.println(date.getYear());
    }

    @Test
    public void testLocalDate(){
        LocalDate date= LocalDate.now();
        System.out.println(date);
        LocalDate date1000=date.plusDays(1000);
        System.out.println(date1000);
        System.out.println(date1000.getYear());
        System.out.println(date1000.getMonth());
        System.out.println(date1000.getDayOfMonth());
    }
}
