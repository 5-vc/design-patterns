/**
 * @Author johnny
 * @Description 迭代器模式(行为型模式)
 * @Date 2022/3/10 8:58 上午
 * @Version 1.0.0
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
