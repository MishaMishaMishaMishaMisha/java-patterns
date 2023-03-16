public class Worker implements Workable {

    private final String name;
    private final String department;

    public Worker(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void payExpenses(int amount) {
        System.out.println(name + " (" + department + ") has been paid $" + amount);
    }

}
