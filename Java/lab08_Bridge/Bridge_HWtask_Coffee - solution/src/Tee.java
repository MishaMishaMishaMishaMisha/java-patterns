public class Tee extends Beverage {
    public Tee(int sugar, BeverageType beverageType, PlaceForDrinkBaverage placeForDrinkBaverage) {
        super(sugar, beverageType, placeForDrinkBaverage);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
        super.prepare();
        if (sugar > 0) System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
    }
    @Override
    public void drink() {
        super.drink();
        System.out.printf("tee\n");
    }
    @Override
    public int cost() {
        return super.cost() + 7;
    }
}
