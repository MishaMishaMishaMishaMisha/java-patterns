public class HandlerGuest extends BaseHandler {

    @Override
    public void setRoot(Account account) {
        if (account.getAccessType() == Account.AccessType.Guest) {
            System.out.println("Guest access provided!");
        }
        else {
            super.setRoot(account);
        }
    }

}
