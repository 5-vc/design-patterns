/**
 * @Author johnny
 * @Description  状态模式(行为型模式)
 * @Date 2022/3/10 11:20 上午
 * @Version 1.0.0
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
