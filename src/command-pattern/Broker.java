import java.util.ArrayList;
import java.util.List;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 3:23 下午
 * @Version 1.0.0
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
