public class BaseHandler implements Handler{

    private Handler next = null;

    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }
    @Override
    public void calculate(Request request) {
        if (next != null) {
            next.calculate(request);
        }
        else {
            System.out.println("error");
        }
    }

}
