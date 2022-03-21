/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 2:36 下午
 * @Version 1.0.0
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
