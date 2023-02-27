public class EngineBuilder {

    int power = 100;     //  Потужність
    int torque = 20;    //  Крутний момент
    Engine.Fuel fuel = Engine.Fuel.Petrol;     //  Вид пального
    float volume = 1.5f;  //  Об'єм двигуна

    EngineBuilder setPower(int power) {
        this.power = power;
        return this;
    }
    EngineBuilder setTorque(int torque) {
        this.torque = torque;
        return this;
    }
    EngineBuilder setFuel(Engine.Fuel fuel) {
        this.fuel = fuel;
        return this;
    }
    EngineBuilder setVolume(float volume) {
        this.volume = volume;
        return this;
    }

    Engine build() {
        return new Engine(power, torque, fuel, volume);
    }
}
