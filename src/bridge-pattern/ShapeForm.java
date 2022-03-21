/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 3:05 下午
 * @Version 1.0.0
 */
public abstract class ShapeForm {
    protected DrawAPI drawAPI;
    protected ShapeForm(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
