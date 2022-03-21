import java.util.ArrayList;
import java.util.List;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 3:43 下午
 * @Version 1.0.0
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
