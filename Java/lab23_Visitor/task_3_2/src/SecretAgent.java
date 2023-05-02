public class SecretAgent extends Spy {

    private int amount;
    private Purpose purpose;

    public SecretAgent() {
        purpose = Purpose.stealSecretPapers;
        amount = 1;
    }
    public SecretAgent(Purpose purpose, int amount) {
        this.purpose = purpose;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        if (purpose == Purpose.stealSecretPapers) {
            int papers = generalStaff.getSecretPaper();
            if (amount >= papers) {
                generalStaff.setSecretPaper(0);
            }
            else {
                generalStaff.setSecretPaper(papers - amount);
            }
        }
        else {
            return;
        }
    }
    @Override
    public void visit(MilitaryBase militaryBase) {
        return;
    }

}
