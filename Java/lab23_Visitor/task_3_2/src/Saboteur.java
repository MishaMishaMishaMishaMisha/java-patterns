public class Saboteur extends Spy {

    private int amount;
    private Purpose purpose;

    public Saboteur() {
        purpose = Purpose.destroySecretPapers;
        amount = 1;
    }
    public Saboteur(Purpose purpose, int amount) {
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
        if (purpose == Purpose.destroyGenerals) {
            int generals = generalStaff.getGenerals();
            if (amount >= generals) {
                generalStaff.setGenerals(0);
            }
            else {
                generalStaff.setGenerals(generals - amount);
            }
        }
        else if (purpose == Purpose.destroySecretPapers) {
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
        if (purpose == Purpose.destroyOfficers) {
            int officers = militaryBase.getOfficers();
            if (amount >= officers) {
                militaryBase.setOfficers(0);
            }
            else {
                militaryBase.setOfficers(officers - amount);
            }
        }
        else if (purpose == Purpose.destroySoldiers) {
            int soldiers = militaryBase.getSoldiers();
            if (amount >= soldiers) {
                militaryBase.setSoldiers(0);
            }
            else {
                militaryBase.setSoldiers(soldiers - amount);
            }
        }
        else if (purpose == Purpose.destroyJeeps) {
            int jeeps = militaryBase.getJeeps();
            if (amount >= jeeps) {
                militaryBase.setJeeps(0);
            }
            else {
                militaryBase.setJeeps(jeeps - amount);
            }
        }
        else if (purpose == Purpose.destroyTanks) {
            int tanks = militaryBase.getTanks();
            if (amount >= tanks) {
                militaryBase.setTanks(0);
            }
            else {
                militaryBase.setTanks(tanks - amount);
            }
        }
        else {
            return;
        }
    }

}
