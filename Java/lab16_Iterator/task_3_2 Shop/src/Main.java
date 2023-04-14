public class Main {

    public static void main(String[] args) {

        ShopItem pens = new ShopItem("pen", 175);
        ShopItem pencils = new ShopItem("pencil", 0);
        ShopItem paper = new ShopItem("paper", 500);
        ShopItem newitem = new ShopItem("newitem", 200);

        Shop shop = new Shop();
        shop.putItem(pens);
        shop.putItem(pencils);
        shop.putItem(paper);
        shop.putItem(newitem);


        System.out.println("Сортуємо по кількості за спаданням");
        shop.setIteratorFactory(IteratorSortAmount::new);
        for (ShopItem item : shop){
          System.out.println(item);
        }
        System.out.println("Сортуємо по назві");
        shop.setIteratorFactory(IteratorSortName::new);
        for (ShopItem item : shop){
            System.out.println(item);
        }

    }

}