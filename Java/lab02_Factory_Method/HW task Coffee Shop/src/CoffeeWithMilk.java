
public class CoffeeWithMilk implements Coffee {
    private double cost;
    private double price;

    public CoffeeWithMilk(double cost, double price) {
        this.cost = cost;
        this.price = price;
    }
    @Override
    public double costPrice() {
        return price - cost;
    }
}
