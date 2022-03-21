/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 9:52 上午
 * @Version 1.0.0
 */
public class Vegetable implements Canteen{

    private String dish;
    private int volume;
    private int num;

    public Vegetable(String dish){
        this.dish = dish;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setNum(int num){
        this.num = num;
    }
    @Override
    public void eat() {
        System.out.println("Circle: Draw() [dish : " + dish
                +", volume : " + volume +", num :" + num );
    }
}
