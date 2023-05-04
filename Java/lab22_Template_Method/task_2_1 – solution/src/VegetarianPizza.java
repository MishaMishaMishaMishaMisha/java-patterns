/**
 * Вегетаріанська піца
 */
public class VegetarianPizza extends Pizza {

  /**
   * Додати наповнювачі
   */
  @Override
  public void addToppings() {
    System.out.println("Add tomato");
    System.out.println("Add cheese");
    System.out.println("Add peppers");
    System.out.println("Add olives");
  }

  /**
   * Випікати підготовлену піцу
   */
  @Override
  public void cook() {
    System.out.println("Cook in the oven for 15 minutes");
  }



}