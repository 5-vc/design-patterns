import java.util.HashMap;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 9:57 上午
 * @Version 1.0.0
 */
public class CanteenFactory {
    private static final HashMap<String,Vegetable> map = new HashMap();


    public static Vegetable getVegetable(String dish){
        Vegetable vegetable;
        if (map.containsKey(dish)){
            vegetable = (Vegetable) map.get(dish);
        }else{
            vegetable = new Vegetable(dish);
            map.put(dish,vegetable);
            System.out.println("Creating vegetable of dish : " + dish);
        }
        return vegetable;
    }

}
