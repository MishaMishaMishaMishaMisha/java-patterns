public class CreateSquareEq extends CreateEq {
    @Override
    public Equation create() {
        return new SquareEq(coefs.get(0), coefs.get(1), coefs.get(2));
    }
}
