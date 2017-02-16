package bean;

/**
 * Created by 陈敬 on 2017/2/7.
 */
public class Category {
    private int cateId;
    private String cateName;

    public int getCateId(){
        return this.cateId;
    }

    public void setCateId(int id){
        this.cateId=id;
    }

    public String getCateName(){
        return this.cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Category(int cateId,String cateName){
        this.cateId=cateId;
        this.cateName=cateName;
    }

    @Override
    public String toString() {
        return " 商品类型 id="+this.cateId+",name="+this.cateName;
    }
}
