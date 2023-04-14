import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class StaffList implements Iterable<Employee> {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public List<Employee> getArray() {
        return employees;
    }
    public Employee getEmploy(int index) {
        return employees.get(index);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new StaffListIterator(this);
    }

}