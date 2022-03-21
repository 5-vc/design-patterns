/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 4:19 下午
 * @Version 1.0.0
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
