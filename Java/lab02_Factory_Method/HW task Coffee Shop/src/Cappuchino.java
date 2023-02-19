public class Cappuchino implements Coffee {
    private double cost;
    private double price;

    public Cappuchino(double cost, double price) {
        this.cost = cost;
        this.price = price;
    }
    @Override
    public double costPrice() {
        return price - cost;
    }
}
