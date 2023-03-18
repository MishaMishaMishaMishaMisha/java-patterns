public class Sugar extends Topping {

    final private int volume;

    public Sugar(Beverage beverage, int volume) {
        super(beverage);
        this.volume = volume;
    }

    @Override
    public String description() {
        return beverage.description() + " + sugar(" + volume + ")";
    }
    @Override
    public float cost() {
        return beverage.cost() + volume*0.01f;
    }

}
