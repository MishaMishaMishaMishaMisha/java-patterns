public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Product p = creator.createProduct();
        p.doSomething();
    }
}
