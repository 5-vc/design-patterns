/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 3:20 下午
 * @Version 1.0.0
 */
public class BuyStock implements Order{

    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
