package com.cathy.domain;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//import org.hibernate.validator.constraints.Email;
//import org.springframework.web.multipart.MultipartFile;

public class Category {

//    @NotNull
//    @Min(1)
    //todo:表单校验没通过
    private int cateId;
    private String cateName;

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
}