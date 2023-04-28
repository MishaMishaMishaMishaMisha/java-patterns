public class Customer {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
      this.strategy = strategy;
    }
    public void makePayment(int amount) {
      if (strategy != null){
        strategy.makePayment(amount);
      } else {
        throw new IllegalArgumentException("PaymentStrategy is not set!");
      }
    }
}