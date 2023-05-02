public class DecreaseSalary implements SalaryVisitor {

    private int percent;

    public DecreaseSalary(int percent) {
        this.percent = percent;
    }
    public DecreaseSalary() {
        this.percent = 10;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public void visit(Manager manager) {
        int salary = manager.getSalary();
        salary -= salary*percent/100;
        manager.setSalary(salary);
    }
    @Override
    public void visit(SalesPerson salesPerson) {
        int salary = salesPerson.getSalary();
        salary -= salary*percent/100;
        salesPerson.setSalary(salary);
    }
    @Override
    public void visit(ITemployee iTemployee) {
        int salary = iTemployee.getSalary();
        salary -= salary*percent/100;
        iTemployee.setSalary(salary);
    }

}