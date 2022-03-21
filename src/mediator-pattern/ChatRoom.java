import java.util.Date;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 9:11 上午
 * @Version 1.0.0
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
