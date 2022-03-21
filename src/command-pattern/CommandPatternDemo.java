/**
 * @Author johnny
 * @Description 命令模式(行为型模式)
 * @Date 2022/3/9 3:25 下午
 * @Version 1.0.0
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
