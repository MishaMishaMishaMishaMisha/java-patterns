import java.lang.Math;

public class SquareEq extends Equation {
    protected double c = 0;
    public SquareEq(double c, double b, double a) {
        super(b, a);
        this.c = c;
    }
    public SquareEq(SquareEq other) {
        super(other);
        this.c = other.c;
    }

    @Override
    public Equation clone() {
        return new SquareEq(this);
    }

    @Override
    public double[] solve() {
        double D = b*b - 4*a*c;
        if (c == 0) {
            return super.solve();
        }
        else if (D < 0) {
            System.out.println("No roots");
            double[] roots = {Double.NaN};
            return roots;
        }
        else if (D == 0) {
            double[] roots = {-b/(2*c)};
            return roots;
        }
        else {
            double[] roots = {(-b - Math.sqrt(D))/(2*c), (-b + Math.sqrt(D))/(2*c)};
            return roots;
        }
    }

    @Override
    public String toString() {
        return c + "*x^2 + " + b + "*x + " + a + " = 0";
    }
}
