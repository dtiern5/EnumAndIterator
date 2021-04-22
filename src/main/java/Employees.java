
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {

    private List<Person> employeeList;

    public Employees() {
        employeeList = new ArrayList<>();
    }

    public void add(Person person) {
        employeeList.add(person);
    }

    public void add(List<Person> peopleToAdd) {
        employeeList.addAll(peopleToAdd);
    }

    public void print() {
        employeeList.stream().forEach(person -> System.out.println(person.toString()));
    }

    public void print(Education education) {
        Iterator<Person> iterator = employeeList.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person.toString());
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
