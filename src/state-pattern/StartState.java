/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 11:18 上午
 * @Version 1.0.0
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "Start State";
    }
}
