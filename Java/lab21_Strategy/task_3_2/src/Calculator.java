public class Calculator {

    private StrategyOperation strategy;

    public void setStrategy(StrategyOperation strategy) {
        this.strategy = strategy;
    }
    public int makeOperation(int a, int b) {
        if (strategy != null){
            return strategy.execute(a, b);
        } else {
            throw new IllegalArgumentException("Strategy is not set!");
        }
    }

}