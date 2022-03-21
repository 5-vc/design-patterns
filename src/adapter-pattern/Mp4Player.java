/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 2:41 下午
 * @Version 1.0.0
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
