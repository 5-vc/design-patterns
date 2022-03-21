/**
 * @Author johnny
 * @Description
 * @Date 2022/3/7 4:37 下午
 * @Version 1.0.0
 */
public class CarFactory  extends TrafficAbstract{
    @Override
    public Bike getBike(String obj) {
        return null;
    }

    @Override
    public Car getCar(String obj){
        if (obj == null || obj.length() == 0){
            return null;
        }else if (obj.equalsIgnoreCase("aodi")){
            return new Aodi();
        }else if (obj.equalsIgnoreCase("bmw")){
            return new BMW();
        }else if (obj.equalsIgnoreCase("redflag")){
            return new RedFlag();
        }
        return null;
    }
}
