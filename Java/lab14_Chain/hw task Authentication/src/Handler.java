public interface Handler {

    void setNext(Handler handler);
    void setRoot(Account account);

}
