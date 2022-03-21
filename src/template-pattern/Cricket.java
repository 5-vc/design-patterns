/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 4:18 下午
 * @Version 1.0.0
 */
public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
