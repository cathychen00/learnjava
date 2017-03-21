package com.cathy.controller;

import com.cathy.domain.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by 陈敬 on 2017/2/15.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    @RequestMapping(value="/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id,Model model) {
        //todo:get category from db
        Category category=new Category();
        category.setCateId(id);
        category.setCateName("测试分类"+id);
        model.addAttribute("cate",category);

        return "edit";
    }

    @RequestMapping("/detail")
    public String detail(@RequestParam("id") int id,Model model){
        Category category=new Category();
        category.setCateId(id);
        category.setCateName("测试分类"+id);
        model.addAttribute("cate",category);

        return "detail";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Category category){
        //todo:save category to db
        return "redirect:/category/detail?id="+category.getCateId();
    }
}
