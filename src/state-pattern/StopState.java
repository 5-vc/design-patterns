/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 11:19 上午
 * @Version 1.0.0
 */
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
