public abstract class Spy {

    public enum Purpose {
        stealSecretPapers,
        destroySecretPapers,
        destroyGenerals,
        destroyOfficers,
        destroySoldiers,
        destroyJeeps,
        destroyTanks
    }

    public abstract void visit(GeneralStaff generalStaff);
    public abstract void visit(MilitaryBase militaryBase);

}
