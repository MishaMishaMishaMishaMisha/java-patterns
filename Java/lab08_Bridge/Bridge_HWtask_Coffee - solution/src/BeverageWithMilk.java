public class BeverageWithMilk implements BeverageType {

    private final int milk_volume;
    public BeverageWithMilk(int milk_volume) {
        this.milk_volume = milk_volume;
    }

    @Override
    public void prepare() {
        System.out.printf("Put some milk : %s ml...%n", this.milk_volume);
    }
    @Override
    public void drink() {
        System.out.printf("milk ");
    }
    @Override
    public int cost() {
        return (int) (this.milk_volume / 20.0);
    }

}
