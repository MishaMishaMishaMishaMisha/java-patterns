public class Coffee extends Beverage {

    final private boolean extra_coffee;
    public Coffee(int sugar, boolean extra_coffee, BeverageType beverageType, PlaceForDrinkBaverage placeForDrinkBaverage) {
        super(sugar, beverageType, placeForDrinkBaverage);
        this.extra_coffee = extra_coffee;
    }

    @Override
    public void prepare() {
        if (extra_coffee) {
            System.out.println("Put extra coffee...");
        }
        else {
            System.out.println("Put some coffee...");
        }
        super.prepare();
        if (sugar > 0) System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
    }
    @Override
    public void drink() {
        super.drink();
        if (extra_coffee) {
            System.out.printf("extra ");
        }
        System.out.printf("coffee\n");
    }
    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
