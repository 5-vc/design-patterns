/**
 * @Author johnny
 * @Description 桥接模式(结构型模式)
 * @Date 2022/3/8 3:05 下午
 * @Version 1.0.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        ShapeForm redCircle = new CircleB(100,100, 10, new RedCircle());
        ShapeForm greenCircle = new CircleB(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
