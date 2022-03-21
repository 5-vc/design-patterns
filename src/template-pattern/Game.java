/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 4:17 下午
 * @Version 1.0.0
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
