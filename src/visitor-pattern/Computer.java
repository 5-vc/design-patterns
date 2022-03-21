/**
 * @Author johnny
 * @Description
 * @Date 2022/3/11 10:42 上午
 * @Version 1.0.0
 */
public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
