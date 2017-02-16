package bean;

/**
 * Created by 陈敬 on 2017/2/7.
 */
public class Product {
    private int productId;
    private String productName;
    private Category productCategory;

    public int getProductId(){
        return this.productId;
    }

    public void setProductId(int productId){
        this.productId=productId;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    public Product(int productId,String productName,Category category){
        this.productId=productId;
        this.productName=productName;
        this.productCategory=category;
    }


    @Override
    public String toString() {
        return " 商品 id="+this.productId+";name="+this.productName+this.productCategory.toString();
    }
}
