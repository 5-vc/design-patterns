/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 10:32 上午
 * @Version 1.0.0
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState()).toUpperCase());
    }
}
