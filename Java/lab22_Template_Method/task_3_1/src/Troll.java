/**
 * Троль
 */
public class Troll extends Enemy {

  @Override
  public void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  @Override
  public void defenseAction() {
    System.out.println("Defend with club");
  }

  @Override
  public void moveToSafety() {
    System.out.println("Return to the mountain");
  }

}