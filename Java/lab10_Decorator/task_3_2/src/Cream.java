public class Cream extends Topping {

    final private int volume;

    public Cream(Beverage beverage, int volume) {
        super(beverage);
        this.volume = volume;
    }

    @Override
    public String description() {
        return beverage.description() + " + cream(" + volume + ")";
    }
    @Override
    public float cost() {
        return beverage.cost() + volume*0.03f;
    }

}
