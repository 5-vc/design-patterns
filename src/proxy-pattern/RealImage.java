/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 10:45 上午
 * @Version 1.0.0
 */
public class RealImage implements Image{

    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loading(fileName);
    }

    public void loading(String fileName){
        System.out.println("加载。。。:" + fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying RealImage " + fileName);
    }
}
