public class Client {

    public static void main(String[] args) {

        ConcreteUser user1 = new ConcreteUser("User1", ConcreteUser.Type.user);
        ConcreteUser user2 = new ConcreteUser("User2", ConcreteUser.Type.moderator);
        ConcreteUser user3 = new ConcreteUser("User3", ConcreteUser.Type.moderator);
        ConcreteUser user4 = new ConcreteUser("User4", ConcreteUser.Type.user);

        ChatMediator mediator = new ChatMediator();
        user1.setMediator(mediator);
        user2.setMediator(mediator);
        user3.setMediator(mediator);
        user4.setMediator(mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessageAll("Hello, world!");

        user2.sendMessage("Hello!", "User1");

        user4.sendMessageGroup("Hello, mods", ConcreteUser.Type.moderator);

    }

}
