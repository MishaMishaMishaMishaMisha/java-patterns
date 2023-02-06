public class CarSimulator {
    private Car car;
    private CarBuilder carBuilder;
    private int radius;
    private int power;

    public CarSimulator(int radius, int power) {
        car = new Car(radius, power);
        carBuilder = new CarBuilder();
    }

    public void build() {
        carBuilder.buildCar(car);
    }
    public void go() {
        System.out.println("The car is going");
    }
    public void stop() {
        System.out.println("The car stopped");
    }

}
