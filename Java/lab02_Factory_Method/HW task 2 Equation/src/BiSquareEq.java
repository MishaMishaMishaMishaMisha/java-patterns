import java.lang.Math;

public class BiSquareEq extends SquareEq {
    protected double e = 0;
    protected double d = 0;
    public BiSquareEq(double e, double d, double c, double b, double a) {
        super(c, b, a);
        this.e = e;
        this.d = d;
    }

    @Override
    public double[] solve() {
        // cx^2+bx+a=0 or ex^4+cx^2+a=0
        if ( (e == 0 && d != 0) || (e != 0 && (d != 0 || b != 0)) ) {
            System.out.println("This is not bisquare equation");
            double[] roots = {Double.NaN};
            return roots;
        }

        if (e == 0) {
            return super.solve();
        }
        else if (e != 0 && c == 0) {
            if (-a/e < 0) {
                System.out.println("No roots");
                double[] roots = {Double.NaN};
                return roots;
            }
            else if (a == 0) {
                double[] roots = {0};
                return roots;
            }
            else {
                double[] roots = {Math.sqrt(Math.sqrt(-a/e)), -Math.sqrt(Math.sqrt(-a/e))};
                return roots;
            }
        }
        else if (a != 0 && a == 0) {
            double[] roots = {0, Math.sqrt(-c/a), Math.sqrt(-c/a)};
            return roots;
        }
        else {
            Equation eq = new SquareEq(e, c, a);
            double[] rootsOfsq = eq.solve();

            if (Double.isNaN(rootsOfsq[0])) {
                return rootsOfsq;
            }

            if (rootsOfsq.length == 1) {
                if (rootsOfsq[0] < 0) {
                    System.out.println("No roots");
                    double[] roots = {Double.NaN};
                    return roots;
                }
                else if (rootsOfsq[0] == 0) {
                    return rootsOfsq;
                }
                else {
                    double[] roots = {Math.sqrt(rootsOfsq[0]), -Math.sqrt(rootsOfsq[0])};
                    return roots;
                }
            }
            else {
                if (rootsOfsq[0] < 0 && rootsOfsq[1] < 0) {
                    System.out.println("No roots");
                    double[] roots = {Double.NaN};
                    return roots;
                }
                else if (rootsOfsq[0] > 0 && rootsOfsq[1] > 0) {
                    double[] roots = {Math.sqrt(rootsOfsq[0]), -Math.sqrt(rootsOfsq[0]), Math.sqrt(rootsOfsq[1]), -Math.sqrt(rootsOfsq[1])};
                    return roots;
                }
                else if (rootsOfsq[0] < 0 && rootsOfsq[1] > 0) {
                    double[] roots = {Math.sqrt(rootsOfsq[1]), -Math.sqrt(rootsOfsq[1])};
                    return roots;
                }
                else if (rootsOfsq[1] < 0 && rootsOfsq[0] > 0) {
                    double[] roots = {Math.sqrt(rootsOfsq[0]), -Math.sqrt(rootsOfsq[0])};
                    return roots;
                }
                else if (rootsOfsq[0] > 0 && rootsOfsq[1] == 0) {
                    double[] roots = {0, Math.sqrt(rootsOfsq[0]), -Math.sqrt(rootsOfsq[0])};
                    return roots;
                }
                else if (rootsOfsq[1] > 0 && rootsOfsq[0] == 0) {
                    double[] roots = {0, Math.sqrt(rootsOfsq[1]), -Math.sqrt(rootsOfsq[1])};
                    return roots;
                }
                //else if ((rootsOfsq[0] < 0 && rootsOfsq[1] == 0) && (rootsOfsq[0] == 0 && rootsOfsq[1] == 0)) {
                // 0,0 or <,0 or 0,<
                else {
                    double[] roots = {0};
                    return roots;
                }

            }

        }

    }

    @Override
    public String toString() {
        return e + "*x^4 + " + d + "*x*3 + " + c + "*x^2 + " + b + "*x + " + a + " = 0";
    }
}
