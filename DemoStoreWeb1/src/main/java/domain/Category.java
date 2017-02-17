package domain;

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
}