public class Main {

  public static void main(String[] args) {

    Customer customer = new Customer();

    customer.setStrategy(new StrategyPaypal());
    customer.makePayment(50);
    customer.setStrategy(new StrategyGooglePay());
    customer.makePayment(150);
    customer.setStrategy(new StrategBankAccount());
    customer.makePayment(200);

  }

}