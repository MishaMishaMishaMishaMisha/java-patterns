import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private String name = "default";
    private Dough dough = new Dough(Dough.DoughType.STANDARD, Dough.Flour.WHEAT, 20);
    private final List<Topping> toppings = new ArrayList<>();

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PizzaBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }
    public PizzaBuilder addTopping(Topping topping) {
        this.toppings.add(topping);
        return this;
    }

    Pizza build() {
        return new Pizza(name, dough, toppings);
    }

}
