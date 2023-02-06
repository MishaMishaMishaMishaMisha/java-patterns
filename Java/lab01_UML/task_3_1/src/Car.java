public class Car {
    private Wheel wheel;
    private Engine engine;

    public Car(int radius, int power) {
        wheel = new Wheel(radius);
        engine = new Engine(power);
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
