/**
 * @Author johnny
 * @Description 访问者模式(行为型模式)
 * @Date 2022/3/11 10:44 上午
 * @Version 1.0.0
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
