public class Main {
    public static void main(String[] args) {

        CoffeeShop shop = new CoffeeShop();

        shop.makeCoffee(new MakeLatte(), 5, 10);
        shop.makeCoffee(new MakeAmericano(), 3, 12);
        shop.makeCoffee(new MakeLatte(), 5, 10);
        shop.makeCoffee(new MakeCappuchino(), 6.8, 15);
        shop.makeCoffee(new MakeEspresso(), 3.5, 8.5);
        shop.makeCoffee(new MakeCoffeeWithMilk(), 4.25, 9.75);

        shop.profit();

    }
}