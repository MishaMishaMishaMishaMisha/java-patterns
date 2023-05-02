public class Client {

    public static void main(String[] args) {

        StaffList staffList = new StaffList();
        SalaryVisitor visitorInc = new IncreaseSalary(15);
        SalaryVisitor visitorDec = new IncreaseSalary(5);

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new ITemployee(60000));

        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.accept(visitorInc);
        System.out.println("Total amount paid to staff after increase: " + staffList.getSalary());

        staffList.accept(visitorDec);
        System.out.println("Total amount paid to staff after decrease: " + staffList.getSalary());

    }

}