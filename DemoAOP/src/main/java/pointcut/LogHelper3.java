package pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by 陈敬 on 2017/3/17.
 */
@Component
@Aspect
public class LogHelper3 {

    @Before("execution(* service.*.*(..))")
    public void logStart(){
        System.out.println("log start "+new Date().getTime());
    }
}
