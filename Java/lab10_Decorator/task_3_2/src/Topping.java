public class Topping extends Beverage {
    final protected Beverage beverage;

    public Topping(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description();
    }
    @Override
    public float cost() {
        return beverage.cost();
    }

}
