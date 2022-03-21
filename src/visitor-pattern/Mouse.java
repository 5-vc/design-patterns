/**
 * @Author johnny
 * @Description
 * @Date 2022/3/11 10:41 上午
 * @Version 1.0.0
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
