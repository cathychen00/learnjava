package com.cathy.controller;

import com.cathy.domain.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


/**
 * Created by 陈敬 on 2017/2/15.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    @RequestMapping(value="/index")
    public String index(Model model){
        model.addAttribute("name","world");
        return "index.html";
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id,Model model) {
        //todo:get category from db
        Category category=new Category();
        category.setCateId(id);
        category.setCateName("测试分类"+id);
        model.addAttribute("cate",category);

        return "edit.html";
    }

    @RequestMapping("/detail")
    public String detail(@RequestParam("id") int id,Model model){
        Category category=new Category();
        category.setCateId(id);
        category.setCateName("测试分类"+id);
        model.addAttribute("cate",category);

        return "detail.html";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@Valid Category category,Errors errors){
        if(errors.hasErrors()){
            return "edit.html";
        }
        //todo:save category to db
        return "redirect:/category/detail?id="+category.getCateId();
    }
}
