package com.cathy.domain;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Category implements java.io.Serializable{
    public Category(){}

    @NotNull
    @Min(1)
    private int cateId;

    @NotNull
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