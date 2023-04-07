public class HandlerUser extends BaseHandler {

    @Override
    public void setRoot(Account account) {
        if (account.getAccessType() == Account.AccessType.User) {
            String login = account.getLogin();
            String password = account.getPassword();
            String passwordFromUserStorage = StoragePasswords.usersAccounts.get(login);

            if (password.equals(passwordFromUserStorage)) {
                System.out.println("User access provided: " + login);
            } else {
                System.out.println("Access denied: " + login);
            }

        }
        else {
            super.setRoot(account);
        }
    }

}
