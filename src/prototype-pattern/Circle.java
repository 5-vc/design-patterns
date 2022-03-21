/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 11:40 上午
 * @Version 1.0.0
 */
public class Circle extends Shape {

    public Circle(){
        type = "circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
