/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 2:37 下午
 * @Version 1.0.0
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
