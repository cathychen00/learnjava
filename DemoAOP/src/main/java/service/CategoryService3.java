package service;

import org.springframework.stereotype.Component;

/**
 * Created by 陈敬 on 2017/3/17.
 */
@Component
public class CategoryService3 {
    public void add(int id){
        System.out.println("add category id="+id);
    }
}
