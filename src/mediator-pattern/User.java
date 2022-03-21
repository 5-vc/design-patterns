/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 9:11 上午
 * @Version 1.0.0
 */
public class User {
    private String name;

    public User(String name){
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
