public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        Car car1 = director.buildCar1();
        Car car2 = director.buildCar2();
        Car car3 = director.buildCar3();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


        System.out.println("===COPIES===");

        Car car1copy = car1.clone();
        Car car2copy = car2.clone();
        Car car3copy = car3.clone();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}