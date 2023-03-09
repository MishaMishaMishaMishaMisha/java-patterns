import com.vehiclecalculator.Vehicle;

public class UkrCarCalculator implements Customs {

    public static float averageCarPrice = 200000f;

    public UkrCarCalculator() {
    }

    public float getRetailPrice(Auto auto) {
        switch (auto.model) {
            case "Ford":
                return 250000f;
            case "Audi":
                return 200000f;
            case "BMW":
                return 450000f;
            case "Tesla":
                return 500000f;
            default:
                return averageCarPrice;
        }
    }

    @Override
    public float vehiclePrice(Auto var1) {
        float temp = Math.max(getRetailPrice(var1) - var1.age * 100 - var1.mileage / 100, 0);
        if (var1.damaged) {
            return temp*0.5f;
        }
        else {
            return temp;
        }
    }
    @Override
    public float tax(Auto var1) {
        float minimum = 2684f;
        float price = vehiclePrice(var1);

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

}
