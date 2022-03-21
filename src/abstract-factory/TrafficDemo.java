/**
 * @Author johnny
 * @Description 抽象工厂模式(创建型模式)
 * @Date 2022/3/7 5:24 下午
 * @Version 1.0.0
 */
public class TrafficDemo {

    //抽象工厂模式
    public static void main(String[] args) {
        TrafficAbstract trafficAbstract = FactoryProducer.getFactory("bike");
        Bike bike = trafficAbstract.getBike("mobai");
        bike.info();
        TrafficAbstract trafficAbstract1 = FactoryProducer.getFactory("car");
        Car car = trafficAbstract1.getCar("redflag");
        car.info();
    }
}
