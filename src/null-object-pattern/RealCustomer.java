/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 2:26 下午
 * @Version 1.0.0
 */
public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
