public class Espresso implements Coffee {
    private double cost;
    private double price;

    public Espresso(double cost, double price) {
        this.cost = cost;
        this.price = price;
    }
    @Override
    public double costPrice() {
        return price - cost;
    }
}
