public class HandlerAddition extends BaseHandler {

    @Override
    public void calculate(Request request) {
        if (request.getType() == Request.OperationType.addition) {
            double n1 = request.getNumber1();
            double n2 = request.getNumber2();
            System.out.println(Double.toString(n1) + " + " + Double.toString(n2) + " = " + Double.toString(n1+n2));
        }
        else {
            super.calculate(request);
        }

    }

}
