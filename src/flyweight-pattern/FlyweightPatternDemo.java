/**
 * @Author johnny
 * @Description 享元模式(结构型模式)
 * @Date 2022/3/9 9:56 上午
 * @Version 1.0.0
 */
public class FlyweightPatternDemo {
    private static final String dishs[] =
            { "pizza", "friedRice", "soup", "bun", "noodle" };
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            Vegetable vegetable = CanteenFactory.getVegetable(getRandomDish());
            vegetable.setNum(getRandomNum());
            vegetable.setVolume(getRandomVolume());
            vegetable.eat();
        }
    }

    private static String getRandomDish() {
        return dishs[(int)(Math.random()*dishs.length)];
    }
    private static int getRandomVolume() {
        return (int)(Math.random()*5 );
    }
    private static int getRandomNum() {
        return (int)(Math.random()*5);
    }
}
