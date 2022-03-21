/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 2:26 下午
 * @Version 1.0.0
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
