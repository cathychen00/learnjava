package com.cathy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 陈敬 on 2017/2/15.
 */
@Controller
public class CategoryController {
    @RequestMapping(value="/category/index")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/category/edit")
    public String edit() {
        return "edit";
    }

    @RequestMapping("/category/detail")
    public String detail(){
        return "detail";
    }
}
