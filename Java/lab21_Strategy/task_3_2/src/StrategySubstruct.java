public class StrategySubstruct implements StrategyOperation {

    @Override
    public int execute(int a, int b) {
        int res = a - b;
        System.out.printf("%s - %s = %s%n", a, b, res);
        return res;
    }

}
