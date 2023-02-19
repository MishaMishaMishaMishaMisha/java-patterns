public class Americano implements Coffee {
    private double cost;
    private double price;

    public Americano(double cost, double price) {
        this.cost = cost;
        this.price = price;
    }
    @Override
    public double costPrice() {
        return price - cost;
    }
}
