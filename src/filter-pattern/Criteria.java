import java.util.List;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 3:43 下午
 * @Version 1.0.0
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
