public class HyundaiTrolleybus extends Trolleybus {
    public HyundaiTrolleybus() {
        super(7000000, 11);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Hyundai Trolleybus runs");
    }
}
