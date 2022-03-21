/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 3:33 下午
 * @Version 1.0.0
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
