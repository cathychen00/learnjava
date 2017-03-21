package com.cathy.controller;

import com.cathy.domain.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
    public String detail(@RequestParam("id") int id,Model model){
        Category category=new Category();
        category.setCateId(id);
        category.setCateName("测试分类"+id);
        model.addAttribute("cate",category);

        return "detail";
    }
}
