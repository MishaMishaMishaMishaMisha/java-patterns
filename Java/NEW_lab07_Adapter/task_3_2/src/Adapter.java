import com.vehiclecalculator.*;

public class Adapter implements Customs {
    final VehicleCalculator vehicleCalculator;

    public Adapter(VehicleCalculator vehicleCalculator) {
        this.vehicleCalculator = vehicleCalculator;
    }

    @Override
    public float vehiclePrice(Auto var1) {
        float damage = 1f;
        if (var1.damaged) {
            damage = 0.2f;
        }
        vehicleCalculator.setVehicle(new Vehicle(var1.age, var1.model, damage, var1.mileage));

        String s = vehicleCalculator.calculatePrice();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'U') {
                break;
            }
            s1 += c;
        }
        return convertCurrency(Float.parseFloat(s1));
    }
    @Override
    public float tax(Auto var1) {
        float price = vehiclePrice(var1);
        float minimum = 2684f;

        if (price < 165*minimum) {
            return price*0.03f;
        }
        else if (price < 290*minimum) {
            return price*0.04f;
        }
        else {
            return price*0.05f;
        }
    }

    private float convertCurrency(float usd) {
        float uah = usd * 36.92f;
        return uah;
    }
}
