public class SkodaTrolleybus extends Trolleybus {
    public SkodaTrolleybus() {
        super(6800000, 12);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Skoda Trolleybus runs");
    }
}
