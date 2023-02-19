
public class CoffeeShop {

    private double total = 0;

    public void makeCoffee(MakeCoffee makeCoffee, double cost, double price) {
        Coffee coffee = makeCoffee.createCoffee(cost, price);
        total += coffee.costPrice();
    }
    public void profit() {
        System.out.printf("Profit : %f", total);
    }
}
