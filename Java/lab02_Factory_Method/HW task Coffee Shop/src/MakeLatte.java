public class MakeLatte implements MakeCoffee {
    @Override
    public Coffee createCoffee(double cost, double price) {
        return new Latte(cost, price);
    }
}
