/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 3:19 下午
 * @Version 1.0.0
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
