/**
 * @Author johnny
 * @Description
 * @Date 2022/3/11 10:40 上午
 * @Version 1.0.0
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
