/**
 * @Author johnny
 * @Description  中介者模式(行为型模式)
 * @Date 2022/3/10 9:12 上午
 * @Version 1.0.0
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
