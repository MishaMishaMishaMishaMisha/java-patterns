public class CarBuilder {

    private Car.Type type = Car.Type.Sedan;
    private Car.CarColor carcolor = Car.CarColor.White;
    private Engine engine = new Engine(100, 20, Engine.Fuel.Petrol, 1.5f);
    private Wheel wheel = new Wheel(Wheel.Material.Steel, 40);

    CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }
    CarBuilder setColor(Car.CarColor color) {
        this.carcolor = color;
        return this;
    }
    CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }
    CarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    Car build() {
        return new Car(type, carcolor, engine, wheel);
    }
}
