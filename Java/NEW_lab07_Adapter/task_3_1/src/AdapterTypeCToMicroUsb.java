import com.mobile.Legacy.*;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger {

    final TypeCCharger typeCCharger;

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
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
}
