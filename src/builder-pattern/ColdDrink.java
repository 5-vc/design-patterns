/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 9:49 上午
 * @Version 1.0.0
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }
    @Override
    public abstract float price();
}
