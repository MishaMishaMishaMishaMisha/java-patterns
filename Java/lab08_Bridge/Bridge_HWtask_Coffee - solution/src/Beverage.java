public abstract class Beverage {

    protected final int sugar;
    private final BeverageType beverageType;
    private final PlaceForDrinkBaverage placeForDrinkBaverage;

    public Beverage(int sugar, BeverageType beverageType, PlaceForDrinkBaverage placeForDrinkBaverage) {
        this.sugar = sugar;
        this.beverageType = beverageType;
        this.placeForDrinkBaverage = placeForDrinkBaverage;
    }

    public void prepare() {
        beverageType.prepare();
    }
    public void drink() {
        placeForDrinkBaverage.drink();
        beverageType.drink();
    }
    public int cost() {
        return beverageType.cost();
    }
}
