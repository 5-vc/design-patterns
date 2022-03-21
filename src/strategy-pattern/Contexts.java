/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 3:34 下午
 * @Version 1.0.0
 */
public class Contexts {
    private Strategy strategy;

    public Contexts(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
