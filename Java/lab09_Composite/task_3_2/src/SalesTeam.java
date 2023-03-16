import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Workable {

    private final ArrayList<Workable> workers = new ArrayList<>();

    private final Workable boss;

    public SalesTeam(Workable worker) {
        this.boss = worker;
    }

    public ArrayList<Workable> getChildren() {
        return workers;
    }
    public void add(Workable worker) {
        workers.add(worker);
    }
    public void remove(Workable worker){
        workers.remove(worker);
    }

    @Override
    public void payExpenses(int amount) {
        boss.payExpenses(amount);

        for (Workable worker : workers) {
            worker.payExpenses(amount);
        }
    }

}
