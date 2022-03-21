/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 2:37 下午
 * @Version 1.0.0
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
