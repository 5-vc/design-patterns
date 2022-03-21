/**
 * @Author johnny
 * @Description 模板模式(行为型模式)
 * @Date 2022/3/10 4:20 下午
 * @Version 1.0.0
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
