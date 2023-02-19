public class MakeCoffeeWithMilk implements MakeCoffee {
    @Override
    public Coffee createCoffee(double cost, double price) {
        return new CoffeeWithMilk(cost, price);
    }
}
