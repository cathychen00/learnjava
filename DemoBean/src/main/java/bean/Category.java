package bean;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private int cateId;

    public Category() {
    }

    public Category(int id) {
        cateId = id;
    }

    public int getCateId() {
        return this.cateId;
    }

    public void setCateId(int id) {
        this.cateId = id;
    }

    @Override
    public String toString() {
        return " 商品类型 id=" + this.cateId;
    }

}
