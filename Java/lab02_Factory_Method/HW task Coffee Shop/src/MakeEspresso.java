public class MakeEspresso implements MakeCoffee {
    @Override
    public Coffee createCoffee(double cost, double price) {
        return new Espresso(cost, price);
    }
}
