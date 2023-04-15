public class ConcreteUser implements User {

    final private String userId;
    private Mediator mediator;

    public ConcreteUser(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessageAll(String message) {
        if (mediator != null){
            mediator.sendAll(this, message);
        }
    }

    @Override
    public void sendMessage(String message, String userTo) {
        if (mediator != null){
            mediator.sendUser(this, userTo, message);
        }
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}
