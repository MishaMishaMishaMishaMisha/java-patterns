import java.util.HashMap;
import java.util.Map;

public class StoragePasswords {

    static Map<String, String> adminsAccounts = new HashMap<>();
    static Map<String, String> usersAccounts = new HashMap<>();

    static public void addAdminAcc(String name, String pas) {
        adminsAccounts.put(name, pas);
    }
    static public void addUserAcc(String name, String pas) {
        usersAccounts.put(name, pas);
    }

}
