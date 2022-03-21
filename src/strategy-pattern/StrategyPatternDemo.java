/**
 * @Author johnny
 * @Description  策略模式(行为型模式)
 * @Date 2022/3/10 3:35 下午
 * @Version 1.0.0
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Contexts context = new Contexts(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Contexts(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Contexts(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
