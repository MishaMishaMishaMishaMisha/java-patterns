public class HandlerDivision  extends BaseHandler {

    @Override
    public void calculate(Request request) {
        if (request.getType() == Request.OperationType.division) {
            double n1 = request.getNumber1();
            double n2 = request.getNumber2();
            if (n2 == 0) {
                System.out.println("Error (division by error)");
            }
            else {
                System.out.println(Double.toString(n1) + " / " + Double.toString(n2) + " = " + Double.toString(n1 / n2));
            }
        }
        else {
            super.calculate(request);
        }

    }

}