public class VolvoTram extends Tram {
    public VolvoTram() {
        super(10000000, 7);
    }
    @Override
    public void goByRails() {
        System.out.println("Volvo Tram runs!");
    }
}