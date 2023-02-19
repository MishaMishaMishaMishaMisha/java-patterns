public class CreateBiSquareEq extends CreateEq {
    @Override
    public Equation create() {
        return new BiSquareEq(coefs.get(0), coefs.get(1), coefs.get(2), coefs.get(3), coefs.get(4));
    }
}