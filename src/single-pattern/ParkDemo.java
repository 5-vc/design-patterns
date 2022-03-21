/**
 * @Author johnny
 * @Description 单例模式(创建型模式)
 * @Date 2022/3/7 6:11 下午
 * @Version 1.0.0
 */
public class ParkDemo {
    public static void main(String[] args) {
        Parking parking = Parking.getSingle();
        parking.info();

    }
}
