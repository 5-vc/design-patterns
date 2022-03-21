/**
 * @Author johnny
 * @Description 装饰器模式(结构型模式)
 * @Date 2022/3/8 5:07 下午
 * @Version 1.0.0
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Sculpt circle = new Ring();
        ShapeDecorator redCircle = new RedShapeDecorator(new Ring());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
