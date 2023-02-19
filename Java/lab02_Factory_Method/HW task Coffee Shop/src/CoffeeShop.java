import java.util.Hashtable;

public class CoffeeShop {
    private Hashtable<String, Double> ingridients = new Hashtable<String, Double>();
    private double total = 0;

    public void addIngridient(String name, double price) {
        ingridients.put(name, price);
    }

    public void makeCoffee(int n, MakeCoffee make(double cost, double price)) {
        for (int i = 0; i < n; i++) {
            Coffee coffee = make.createCoffee();
            total += coffee.costPrice();
        }
    }
    public void profit() {
        System.out.printf("Profit : %d", total);
    }
}
