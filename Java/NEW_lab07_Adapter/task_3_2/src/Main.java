import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto(5, "Audi", true, 100_000);
        Customs calculator = new Adapter(new CarCalculator());
        float totalPrice = calculator.vehiclePrice(auto) + calculator.tax(auto);
        System.out.println("Повна вартість автомобіля " + totalPrice + " гривень");
    }


}
