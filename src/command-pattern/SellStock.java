/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 3:22 下午
 * @Version 1.0.0
 */
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
