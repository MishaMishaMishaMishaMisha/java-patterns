public class WheelBuilder {

    private Wheel.Material material = Wheel.Material.Steel;
    private int diameter = 40;

    WheelBuilder setMaterial(Wheel.Material material) {
        this.material = material;
        return this;
    }
    WheelBuilder setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    Wheel build() {
        return new Wheel(material, diameter);
    }
}
