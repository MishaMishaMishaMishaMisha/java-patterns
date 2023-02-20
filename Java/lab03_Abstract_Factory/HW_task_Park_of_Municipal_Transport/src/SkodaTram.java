public class SkodaTram extends Tram {
    public SkodaTram() {
        super(9000000, 8);
    }
    @Override
    public void goByRails() {
        System.out.println("Skoda Tram runs!");
    }
}