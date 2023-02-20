public class HyundaiBus extends Bus {
    public HyundaiBus() {
        super(5500000, 20);
    }
    @Override
    public void goByWay() {
        System.out.println("Hyundai Bus runs!");
    }
}
