import java.util.ArrayList;
import java.util.List;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 3:45 下午
 * @Version 1.0.0
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
