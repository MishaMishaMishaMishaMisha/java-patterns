public class  Client {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.setStrategy(new StrategyAdd());
        calculator.makeOperation(-5, 2);
        calculator.setStrategy(new StrategyMultiply());
        calculator.makeOperation(7, 14);
        calculator.setStrategy(new StrategySubstruct());
        calculator.makeOperation(10, 3);

    }

}