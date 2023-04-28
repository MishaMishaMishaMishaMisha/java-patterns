public class StrategyPaypal implements PaymentStrategy {

    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from PayPal.");
    }

}