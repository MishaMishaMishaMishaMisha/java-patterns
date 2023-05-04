public abstract class Enemy {

    public abstract void pickUpWeapon();

    public abstract void defenseAction();

    public abstract void moveToSafety();

    /**
     * Стратегія захисту та відступу
     */
    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

}
