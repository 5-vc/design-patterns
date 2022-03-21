import javax.xml.ws.Holder;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/7 5:29 下午
 * @Version 1.0.0
 */
public class BikeFactory extends TrafficAbstract{
    @Override
    public Bike getBike(String obj){
        if (obj == null || obj.length() == 0){
            return null;
        }else if (obj.equalsIgnoreCase("mobai")){
            return new Mobai();
        }else if (obj.equalsIgnoreCase("halou")){
            return new Halou();
        }
        return null;
    }

    @Override
    public Car getCar(String obj) {
        return null;
    }
}
