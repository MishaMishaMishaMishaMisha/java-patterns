public class BaseHandler implements Handler {

    private Handler next = null;

    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void setRoot(Account account) {
        if (next != null) {
            next.setRoot(account);
        }
        else {
            System.out.println("error");
        }
    }

}
