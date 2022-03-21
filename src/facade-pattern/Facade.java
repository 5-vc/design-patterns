/**
 * @Author johnny
 * @Description
 * @Date 2022/3/9 9:15 上午
 * @Version 1.0.0
 */
public class Facade {
    private Systems register;
    private Systems login;
    private Systems update;

    public Facade(){
        register = new Register();
        login = new Login();
        update = new Update();
    }

    public void RegisterDraw(){
        register.draw();
    };

    public void LoginDraw(){
        login.draw();
    };

    public void UpdateDraw(){
        update.draw();
    };
}
