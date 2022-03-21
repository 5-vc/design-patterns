/**
 * @Author johnny
 * @Description 代理模式(结构型模式)
 * @Date 2022/3/9 10:52 上午
 * @Version 1.0.0
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        // 图像不需要从磁盘加载
        image.display();
    }
}
