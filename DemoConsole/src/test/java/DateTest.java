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

    @Test
    public void printMonthCalenda(){
        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();

        System.out.println("一   二   三   四   五   六   日");
        LocalDate currentDate=date.minusDays(today-1);
        for(int i=1;i<currentDate.getDayOfWeek().getValue();i++){
            System.out.print("   ");
        }

        while (currentDate.getMonthValue()==month){
            System.out.printf("%3d",currentDate.getDayOfMonth());
            if(currentDate.getDayOfMonth()==today){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            currentDate=currentDate.plusDays(1);
            if(currentDate.getDayOfWeek().getValue()==1){
                System.out.println();
            }
        }
    }
}
