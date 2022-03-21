/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 5:03 下午
 * @Version 1.0.0
 */
public abstract class ShapeDecorator implements Sculpt{
    protected Sculpt decoratedSculpt;

    public ShapeDecorator(Sculpt decoratedSculpt){
        this.decoratedSculpt = decoratedSculpt;
    }

    @Override
    public void draw(){
        decoratedSculpt.draw();
    }
}
