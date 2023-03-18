public class Milk extends Topping {

    final private int volume;

    public Milk(Beverage beverage, int volume) {
        super(beverage);
        this.volume = volume;
    }

    @Override
    public String description() {
        return beverage.description() + " + milk(" + volume + ")";
    }
    @Override
    public float cost() {
        return beverage.cost() + volume*0.05f;
    }

}
