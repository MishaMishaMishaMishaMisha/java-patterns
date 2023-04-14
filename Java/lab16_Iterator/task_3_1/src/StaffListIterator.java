import java.util.Iterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class StaffListIterator implements Iterator<Employee> {

    final private ArrayList<Employee> list = new ArrayList<>();
    private int index = 0;

    public StaffListIterator(StaffList staffList) {
        list.addAll(staffList.getArray());

        // сортуємо по name
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
    @Override
    public Employee next() {
        return list.get(index++);
    }

}