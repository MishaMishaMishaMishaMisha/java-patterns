public class MakeCappuchino implements MakeCoffee {
    @Override
    public Coffee createCoffee(double cost, double price) {
        return new Cappuchino(cost, price);
    }
}
