/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 11:29 上午
 * @Version 1.0.0
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();

    public String getTYpe(){
        return type;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
