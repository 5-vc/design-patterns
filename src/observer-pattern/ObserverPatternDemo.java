/**
 * @Author johnny
 * @Description 观察者模式(行为型模式)
 * @Date 2022/3/10 10:33 上午
 * @Version 1.0.0
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
