package com.cathy.controller;

import com.cathy.domain.Category;
import com.cathy.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;


/**
 * Created by 陈敬 on 2017/2/15.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    HttpServletRequest request;



//
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
    public String save(@RequestPart("picture") MultipartFile picture, @Valid Category category, Errors errors) throws IOException {

        //todo:save file to image server
        String filepath=request.getRealPath("/")+"upload/"+picture.getOriginalFilename();
        picture.transferTo(new File(filepath));

        if(errors.hasErrors()){
            return "edit.html";
        }
        //todo:save category to db
        return "redirect:/category/detail?id="+category.getCateId();
    }

    @RequestMapping("/error404")
    public String error(){
        throw new NotFoundException();
    }

    @RequestMapping("/error")
    public String errorNotFound() throws Exception {
        throw new Exception();
    }
}
