/**
 * @author 陈敬
 * @date 17/12/1
 */
public class Letter {
    private int num;

    public Letter(int num) {
        this.num = num;
    }

    public void show() {
        System.out.println(num);
    }

    public void change(int num) {
        this.num = num;
    }

    //其实不能交换成功
    public static void swap(Letter a, Letter b) {
        Letter temp;
        temp = a;
        a = b;
        b = temp;
    }
}
