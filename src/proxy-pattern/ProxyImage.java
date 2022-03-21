/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 10:48 上午
 * @Version 1.0.0
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;

    }


    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
