/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 5:05 下午
 * @Version 1.0.0
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Sculpt decoratedSculpt) {
        super(decoratedSculpt);
    }

    @Override
    public void draw() {
        decoratedSculpt.draw();
        setRedBorder(decoratedSculpt);
    }

    private void setRedBorder(Sculpt decoratedSculpt){
        System.out.println("Border Color: Red");
    }
}
