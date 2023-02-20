public class SkodaFactory implements Factory {
    @Override
    public Bus createBus() {
        return new SkodaBus();
    }
    @Override
    public Tram createTram() {
        return new SkodaTram();
    }
    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus();
    }
}
