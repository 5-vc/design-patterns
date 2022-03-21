/**
 * @Author johnny
 * @Description 外观模式(结构型模式)
 * @Date 2022/3/9 9:18 上午
 * @Version 1.0.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        Facade facade =  new Facade();
        facade.RegisterDraw();
        facade.LoginDraw();
        facade.UpdateDraw();
    }
}
