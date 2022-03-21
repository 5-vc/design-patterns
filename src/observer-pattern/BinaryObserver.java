/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 10:28 上午
 * @Version 1.0.0
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState()));
    }
}
