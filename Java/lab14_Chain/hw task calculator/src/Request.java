public class Request {

    public enum OperationType {
        addition,
        substruction,
        multiplication,
        division
    }

    private double number1;
    private double number2;
    private OperationType type;

    public Request(double number1, double number2, OperationType type) {
        this.number1 = number1;
        this.number2 = number2;
        this.type = type;
    }

    public OperationType getType() {
        return this.type;
    }
    public double getNumber1() {
        return this.number1;
    }
    public double getNumber2() {
        return this.number2;
    }

}
