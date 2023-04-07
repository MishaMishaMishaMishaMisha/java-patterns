import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        // Login and passwords for administrators
        StoragePasswords.adminsAccounts.put("admin", "123qweASD");
        StoragePasswords.adminsAccounts.put("administrator", "1234");

        // Login and passwords for users
        StoragePasswords.usersAccounts.put("andrii", "1234");
        StoragePasswords.usersAccounts.put("black_knight", "S@ruman1");
        StoragePasswords.usersAccounts.put("white_knight", "ruman1");

        Account[] users = {
                Account.createAdmin("admin", "123qweASD"),
                Account.createAdmin("administrator", "1234"),
                Account.createUser("andrii", "1234"),
                Account.createGuest(),
                Account.createUser("black_knight", "S@ruman1"),
                Account.createUser("white_knight", "S111"),
                Account.createGuest(),
        };

        Handler handlerGuest = new HandlerGuest();
        Handler handlerUser = new HandlerUser();
        Handler handlerAdmin = new HandlerAdmin();

        handlerGuest.setNext(handlerUser);
        handlerUser.setNext(handlerAdmin);

        for (Account user : users) {

            handlerGuest.setRoot(user);
        }
    }
}