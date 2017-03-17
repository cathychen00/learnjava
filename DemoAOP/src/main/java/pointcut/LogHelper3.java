package pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/**
 * Created by 陈敬 on 2017/3/17.
 */
@Aspect
public class LogHelper3 {

    @Before("execution(* service.*.*(..))")
    public void logStart(){
        System.out.println("log start "+new Date().getTime());
    }
}
