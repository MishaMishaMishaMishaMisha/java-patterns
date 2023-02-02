import java.util.Random;

public class TrafficSimulator {
    public static void main(String[] args) {
        TrafficSimulator sim = new TrafficSimulator();
        Vehicle v = sim.createRandomCar();
        String type_ = v.getType();
        String res_ = v.runTask();

        System.out.println("Type of vehicle " + type_);
        System.out.println("Result of runTask " + res_);
    }

    Vehicle createRandomCar() {
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b ? new Car() : new Truck();
    }
}
