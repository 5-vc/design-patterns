/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 2:41 下午
 * @Version 1.0.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
