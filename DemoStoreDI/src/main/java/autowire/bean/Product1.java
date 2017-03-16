package autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 陈敬 on 2017/2/7.
 */
@Component
public class Product1 {
    private int productId;

    @Autowired
    private Category1 productCategory;

    public int getProductId(){
        return this.productId;
    }

    public void setProductId(int productId){
        this.productId=productId;
    }

    public Category1 getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category1 productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return " 商品 id："+this.productId+";类型："+this.productCategory.toString();
    }
}
