
/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 11:34 上午
 * @Version 1.0.0
 */
public class Rectanzgle extends Shape {

    public Rectanzgle(){
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
