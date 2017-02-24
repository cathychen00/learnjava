package com.data.dto;

import com.data.pojo.Category;
import com.data.pojo.Product;

import java.util.List;

/**
 * Created by 陈敬 on 2017/2/23.
 */
public class CategoryDto {
    private Category category;
    private List<Product> products;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
