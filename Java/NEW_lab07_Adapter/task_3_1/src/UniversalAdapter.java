import com.mobile.Legacy.*;

public class UniversalAdapter implements TypeCCharger, MicroUsbCharger {

    final TypeCCharger typeCCharger;
    final MicroUsbCharger microUsbCharger;

    public UniversalAdapter(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
        this.microUsbCharger = null;
    }
    public UniversalAdapter(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
        this.typeCCharger = null;
    }

    @Override
    public float getOutputVoltage() {
        return convertPowerToVoltage(typeCCharger.getOutputPower());
    }
    @Override
    public float getOutputAmperage() {
        return typeCCharger.getOutputPower()/convertPowerToVoltage(typeCCharger.getOutputPower());
    }
    private float convertPowerToVoltage(float power) {
        // some conversation
        return power * 0.8f;
    }
    @Override
    public float getOutputPower() {
        return microUsbCharger.getOutputVoltage() *
                microUsbCharger.getOutputAmperage();
    }


}
