import java.util.ArrayList;
import java.util.List;

/**
 * @Author johnny
 * @Description
 * @Date 2022/3/8 3:44 下午
 * @Version 1.0.0
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
