/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 3:14 下午
 * @Version 1.0.0
 */
public class CircleB extends ShapeForm{

    private int x, y, radius;

    public CircleB(int x, int y, int radius,DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
