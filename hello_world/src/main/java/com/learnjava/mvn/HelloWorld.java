package com.learnjava.mvn;

/**
 * Created by Chen on 2017/1/13.
 */
public class HelloWorld {
    public String SayHello(){
        return "Hello Maven";
    }
    public static void Main(String[] args) {
        System.out.println(new HelloWorld().SayHello());
    }
}
