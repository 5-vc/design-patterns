import javax.crypto.spec.OAEPParameterSpec;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/7 6:01 下午
 * @Version 1.0.0
 */
public class Parking {
    private Parking(){};
    //懒汉模式,多线程不安全的
    private static Parking parking;

    public static Parking getSingle(){
        if (parking == null){
            parking = new Parking();
        }
        return parking;
    }
    //懒汉模式，多线程安全，双检锁/双重校验锁（DCL，即 double-checked locking）
//    private volatile static Parking parking;
//    public static Parking getSingle(){
//        if (parking == null){
//            synchronized (Parking.class){
//                if(parking == null){
//                    parking = new Parking();
//                }
//            }
//        }
//        return parking;
//    }
    //饿汉模式 多线程安全的
//    private static Parking parking = new Parking();
//    public static Parking getSingle(){
//        return parking;
//    }
//


    public void info(){
        System.out.println("parking.....");
    }
}
