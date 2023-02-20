public class HyundaiTram extends Tram {
    public HyundaiTram() {
        super(9500000, 6);
    }
    @Override
    public void goByRails() {
        System.out.println("Hyundai Tram runs!");
    }
}