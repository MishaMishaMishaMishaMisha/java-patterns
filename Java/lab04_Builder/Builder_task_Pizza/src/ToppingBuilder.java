public class ToppingBuilder {

    private Topping.ToppingType toppingType;
    private String toppingName;
    private int cost;

    public ToppingBuilder setToppingType(Topping.ToppingType toppingType) {
        this.toppingType = toppingType;
        return this;
    }

    public ToppingBuilder setToppingName(String toppingName) {
        this.toppingName = toppingName;
        return this;
    }

    public ToppingBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public Topping build(){
        return new Topping(toppingType, toppingName, cost);
    }

}
