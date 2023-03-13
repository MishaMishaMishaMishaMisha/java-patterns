public class Cafe {

    public static void main(String[] args) {

        Coffee blackCoffee = new Coffee(3, true, new BlackBeverage(200), new Takeaway());
        Tee blackTee = new Tee(3, new BlackBeverage(200), new Restaurant());
        Chocolate blackChocolate = new Chocolate(3, new BlackBeverage(200), new Takeaway());

        Coffee coffeeWithMilk = new Coffee(3, false, new BeverageWithMilk(250), new Restaurant());
        Tee teeWithMilk = new Tee(3, new BeverageWithMilk(250), new Takeaway());
        Chocolate chocolateWithMilk = new Chocolate(3, new BeverageWithMilk(250), new Restaurant());

        beverageInfo(blackCoffee);
        beverageInfo(blackTee);
        beverageInfo(blackChocolate);

        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
        beverageInfo(chocolateWithMilk);

    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
