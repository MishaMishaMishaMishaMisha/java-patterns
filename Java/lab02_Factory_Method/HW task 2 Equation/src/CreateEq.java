import java.util.ArrayList;

public class CreateEq {
    protected ArrayList<Double> coefs;

    public void setCoefs(ArrayList<Double> coefs) {
        this.coefs = coefs;
    }
    public double[] solveEq() {
        Equation eq = create();
        System.out.println(eq);
        return eq.solve();
    }

    public Equation create() {
        return new Equation(coefs.get(0), coefs.get(1));
    }
}
