package com.cathy.bean;

/**
 * Created by 陈敬 on 2017/3/2.
 */
public class Counter {
    private  int total=0;

    public int getTotal() {
        return total++;
    }
}
