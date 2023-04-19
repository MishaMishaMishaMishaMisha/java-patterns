public interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void sendMessageGroup(String message, ConcreteUser.Type type);
    void receiveMassage(String message, String userFrom);
}