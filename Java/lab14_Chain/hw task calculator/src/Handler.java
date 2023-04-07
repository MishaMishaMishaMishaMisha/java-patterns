public interface Handler {

    void setNext(Handler handler);
    void calculate(Request request);

}
