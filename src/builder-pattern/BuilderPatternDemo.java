/**
 * @Author johnny
 * @Description 建造者模式(创建型模式)
 * @Date 2022/3/8 10:37 上午
 * @Version 1.0.0
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());
    }
}
