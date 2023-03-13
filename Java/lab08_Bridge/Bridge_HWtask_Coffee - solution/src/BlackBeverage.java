public class BlackBeverage implements BeverageType {

    private final int water_volume;
    public BlackBeverage(int water_volume) {
        this.water_volume = water_volume;
    }

    @Override
    public void prepare() {
        System.out.printf("Put some hot watter: %s ml...%n", water_volume);
    }
    @Override
    public void drink() {
        System.out.printf("black ");
    }
    @Override
    public int cost() {
        return 0;
    }

}
