public class Client {
    public static void main(String[] args) {

        Request[] requests = {
                new Request(53, 13, Request.OperationType.division),
                new Request(743, 2345, Request.OperationType.substruction),
                new Request(345, 876, Request.OperationType.multiplication),
                new Request(345, 87, Request.OperationType.addition)
        };

        Handler handlerAddition = new HandlerAddition();
        Handler handlerSubctruction = new HandlerSubstruction();
        Handler handlerMultiplication = new HandlerMultiplication();
        Handler handlerDivision = new HandlerDivision();

        handlerAddition.setNext(handlerSubctruction);
        handlerSubctruction.setNext(handlerMultiplication);
        handlerMultiplication.setNext(handlerDivision);

        for (Request request : requests) {
            handlerAddition.calculate(request);
        }

    }
}