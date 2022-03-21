/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 4:36 下午
 * @Version 1.0.0
 */
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
