import java.util.Random;

public class Creator {
    public void someOperation() {
        System.out.println("Operation is done");
    }

    public Product createProduct() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        return b ? new Product1() : new Product2();
    }
}
