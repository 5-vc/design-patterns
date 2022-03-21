/**
 * @Author johnny
 * @Description
 * @Date 2022/3/11 10:43 上午
 * @Version 1.0.0
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
