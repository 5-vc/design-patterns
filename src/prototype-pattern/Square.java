/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 11:39 上午
 * @Version 1.0.0
 */
public class Square extends Shape{
    public Square(){
        type = "square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
