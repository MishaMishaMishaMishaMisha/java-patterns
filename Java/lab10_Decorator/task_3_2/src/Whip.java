public class Whip extends Topping {

    final private int volume;

    public Whip(Beverage beverage, int volume) {
        super(beverage);
        this.volume = volume;
    }

    @Override
    public String description() {
        return beverage.description() + " + whip(" + volume + ")";
    }
    @Override
    public float cost() {
        return beverage.cost() + volume*0.02f;
    }

}
