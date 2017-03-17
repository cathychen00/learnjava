package pointcut;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Date;

/**
 * Created by 陈敬 on 2017/3/17.
 */
public class LogTimeHandler {
    public void log(ProceedingJoinPoint jp) throws Throwable {
        try {
            System.out.println("1.before log "+new Date().getTime());
            jp.proceed();
            System.out.println("2.after log "+new Date().getTime());
        }catch (Exception e){
            System.out.println("log fail ");
        }
    }
}
