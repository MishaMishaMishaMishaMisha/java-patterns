public class ExpensesClient {

  public static void main(String[] args) {

    Workable director = new Manager("Bob", "boss");

    Workable m1 = new Manager("Jane", "meaty");
    Workable m2 = new Manager("Michael", "confectionery");
    Workable m3 = new Manager("Walter", "dairy");

    Workable w1 = new Salesperson("Darius", "meaty", (Manager) m1);
    Workable w2 = new Salesperson("Dennis", "meaty", (Manager) m1);
    Workable w3 = new Salesperson("Sebastien", "meaty", (Manager) m1);
    Workable w4 = new Salesperson("Mckenzie", "confectionery", (Manager) m2);
    Workable w5 = new Salesperson("Kain", "confectionery", (Manager) m2);
    Workable w6 = new Salesperson("Aisha", "confectionery", (Manager) m2);
    Workable w7 = new Salesperson("Tyler", "dairy", (Manager) m3);
    Workable w8 = new Salesperson("Safia", "dairy", (Manager) m3);
    Workable w9 = new Salesperson("Ted", "dairy", (Manager) m3);


    SalesTeam manager = new SalesTeam(director);
    SalesTeam manager1 = new SalesTeam(m1);
    SalesTeam manager2 = new SalesTeam(m2);
    SalesTeam manager3 = new SalesTeam(m2);

    manager1.add(w1);
    manager1.add(w2);
    manager1.add(w3);
    manager2.add(w4);
    manager2.add(w5);
    manager2.add(w6);
    manager3.add(w7);
    manager3.add(w8);
    manager3.add(w9);

    manager.add(manager1);
    manager.add(manager2);
    manager.add(manager1);

    manager.payExpenses(200);

  }

  private static void payWorker(Workable worker, int amount) {
    System.out.println("Expenses have been requested");
    worker.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }

  private static void payTeam(SalesTeam team, int amount) {
    System.out.println("Expenses have been requested");
    team.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }

}
