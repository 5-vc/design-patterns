/**
 * @Author johnny
 * @Description
 * @Date 2022/3/7 5:34 下午
 * @Version 1.0.0
 */
public class FactoryProducer {
    public static TrafficAbstract getFactory(String choice){
        if(choice.equalsIgnoreCase("bike")){
            return new BikeFactory();
        } else if(choice.equalsIgnoreCase("car")){
            return new CarFactory();
        }
        return null;
    }
}
