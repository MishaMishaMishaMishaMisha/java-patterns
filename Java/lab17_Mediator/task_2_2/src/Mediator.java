public interface Mediator {
    void sendAll(User from, String message);
    void sendUser(User from, String to, String message);
}
