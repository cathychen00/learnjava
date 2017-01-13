package com.learnjava.mvn;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Chen on 2017/1/13.
 */
public class HelloWorldTest{

    @Test
    public void TestSayHello(){
        HelloWorld helloWorld=new HelloWorld();
        String result=helloWorld.SayHello();
        Assert.assertEquals("Hello Maven",result);

    }
}
