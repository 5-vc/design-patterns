/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 3:20 下午
 * @Version 1.0.0
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
