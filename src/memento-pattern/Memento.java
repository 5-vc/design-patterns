/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 9:49 上午
 * @Version 1.0.0
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
