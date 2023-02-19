import java.util.ArrayList;

public class DefineEquation {
    private ArrayList<Double> coefs;

    public void setCoefs(ArrayList<Double> coefs) {
        this.coefs = coefs;
    }
    public CreateEq define() {
        if (coefs.size() == 2) {
            CreateEq eq = new CreateEq();
            eq.setCoefs(coefs);
            return eq;
        }
        else if (coefs.size() == 3) {
            CreateEq eq = new CreateSquareEq();
            eq.setCoefs(coefs);
            return eq;
        }
        else {
            CreateEq eq = new CreateBiSquareEq();
            eq.setCoefs(coefs);
            return eq;
        }
    }
}
