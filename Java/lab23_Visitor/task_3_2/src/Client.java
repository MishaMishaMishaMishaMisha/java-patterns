import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        final List<MilitaryObject> militaryObjects = new ArrayList<>();
        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        Spy saboteur = new Saboteur(Spy.Purpose.destroyJeeps, 5);
        Spy agent = new SecretAgent(Spy.Purpose.stealSecretPapers, 20);

        for (MilitaryObject military : militaryObjects) {
            military.accept(saboteur);
            military.accept(agent);
        }

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

    }

}