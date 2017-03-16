package autowire.bean;

import org.springframework.stereotype.Component;

/**
 * Created by 陈敬 on 2017/2/7.
 */
@Component
public class Category1 {
    private int cateId;
    public int getCateId(){
        return this.cateId;
    }

    public void setCateId(int id){
        this.cateId=id;
    }

    @Override
    public String toString() {
        return " 商品类型 id="+this.cateId;
    }
}
