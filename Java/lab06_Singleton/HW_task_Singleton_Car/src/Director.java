import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Director {

    private static Director instance = null;
    private static final Lock lock = new ReentrantLock();


    private Director() {

    }

    public static Director getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new Director();
            }
            lock.unlock();
        }
        return instance;
    }

    Car buildCar1() {
        CarBuilder carBuilder = new CarBuilder();
        EngineBuilder engineBuilder = new EngineBuilder();
        WheelBuilder wheelBuilder = new WheelBuilder();

        return carBuilder
                    .setType(Car.Type.Hatchback)
                    .setColor(Car.CarColor.Red)
                    .setEngine(engineBuilder
                            .setPower(105)
                            .setTorque(140)
                            .setFuel(Engine.Fuel.Petrol)
                            .setVolume(1.4f)
                            .build())
                    .setWheel(wheelBuilder
                            .setMaterial(Wheel.Material.Steel)
                            .setDiameter(14)
                            .build())
                .build();
    }

    Car buildCar2() {
        CarBuilder carBuilder = new CarBuilder();
        EngineBuilder engineBuilder = new EngineBuilder();
        WheelBuilder wheelBuilder = new WheelBuilder();

        return carBuilder
                .setType(Car.Type.Sedan)
                .setColor(Car.CarColor.White)
                .setEngine(engineBuilder
                        .setPower(150)
                        .setTorque(100)
                        .setFuel(Engine.Fuel.Diesel)
                        .setVolume(1.5f)
                        .build())
                .setWheel(wheelBuilder
                        .setMaterial(Wheel.Material.Alloy)
                        .setDiameter(18)
                        .build())
                .build();
    }

    Car buildCar3() {
        CarBuilder carBuilder = new CarBuilder();
        EngineBuilder engineBuilder = new EngineBuilder();
        WheelBuilder wheelBuilder = new WheelBuilder();

        return carBuilder
                .setType(Car.Type.SUV)
                .setColor(Car.CarColor.Black)
                .setEngine(engineBuilder
                        .setPower(200)
                        .setTorque(180)
                        .setFuel(Engine.Fuel.Electric)
                        .setVolume(1.8f)
                        .build())
                .setWheel(wheelBuilder
                        .setMaterial(Wheel.Material.Forged)
                        .setDiameter(15)
                        .build())
                .build();
    }
}
