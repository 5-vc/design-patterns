/**
 * @Author johnny
 * @Description 原型模式(创建型模式)
 * @Date 2022/3/8 11:43 上午
 * @Version 1.0.0
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getTYpe() + "-地址:" + clonedShape);
        System.out.println(ShapeCache.shapeMap.get("1"));

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getTYpe()+ "-地址:" + clonedShape2);
        System.out.println(ShapeCache.shapeMap.get("2"));

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getTYpe()+ "-地址:" + clonedShape3);
        System.out.println(ShapeCache.shapeMap.get("3"));
    }
}
