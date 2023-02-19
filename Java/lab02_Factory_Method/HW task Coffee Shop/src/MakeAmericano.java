public class MakeAmericano implements MakeCoffee {
    @Override
    public Coffee createCoffee(double cost, double price) {
        return new Americano(cost, price);
    }
}
