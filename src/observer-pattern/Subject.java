import java.util.ArrayList;
import java.util.List;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/10 10:26 上午
 * @Version 1.0.0
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
