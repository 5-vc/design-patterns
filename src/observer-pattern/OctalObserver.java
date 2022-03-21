/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 10:30 上午
 * @Version 1.0.0
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState()));
    }
}
