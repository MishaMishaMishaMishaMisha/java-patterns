public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        espresso = new Sugar(espresso, 2);
        System.out.println(espresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Cream(darkRoast, 1);
        darkRoast = new Sugar(darkRoast, 2);
        System.out.println(darkRoast);

        Beverage darkRoast2 = new DarkRoast();
        darkRoast2 = new Whip(darkRoast2, 1);
        darkRoast2 = new Sugar(darkRoast2, 1);
        System.out.println(darkRoast2);

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf, 1);
        decaf = new Sugar(decaf, 2);
        System.out.println(decaf);

    }
}
