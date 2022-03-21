/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 11:19 上午
 * @Version 1.0.0
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
