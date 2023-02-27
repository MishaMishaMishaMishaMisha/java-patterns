public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        Pizza pizza = director.makePizza();
        System.out.println(pizza);
    }
}