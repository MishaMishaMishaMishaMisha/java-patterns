import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Bus> Skoda_buses = new ArrayList<>();
        ArrayList<Tram> Skoda_trams = new ArrayList<>();
        ArrayList<Trolleybus> Skoda_trolleybuses = new ArrayList<>();
        ArrayList<Bus> Volvo_buses = new ArrayList<>();
        ArrayList<Tram> Volvo_trams = new ArrayList<>();
        ArrayList<Trolleybus> Volvo_trolleybuses = new ArrayList<>();
        ArrayList<Bus> Hyundai_buses = new ArrayList<>();
        ArrayList<Tram> Hyundai_trams = new ArrayList<>();
        ArrayList<Trolleybus> Hyundai_trolleybuses = new ArrayList<>();

        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтований пробіг експлуатації

        Factory factorySkoda = new SkodaFactory();
        Factory factoryVolvo = new VolvoFactory();
        Factory factoryHyundai = new HyundaiFactory();

        for (int i = 0; i < A; i++) {
            Bus skoda = factorySkoda.createBus();
            Bus volvo = factoryVolvo.createBus();
            Bus hyundai = factoryHyundai.createBus();
            Skoda_buses.add(skoda);
            Volvo_buses.add(volvo);
            Hyundai_buses.add(hyundai);
        }

        for (int i = 0; i < T; i++) {
            Tram skoda = factorySkoda.createTram();
            Tram volvo = factoryVolvo.createTram();
            Tram hyundai = factoryHyundai.createTram();
            Skoda_trams.add(skoda);
            Volvo_trams.add(volvo);
            Hyundai_trams.add(hyundai);
        }

        for (int i = 0; i < Tr; i++) {
            Trolleybus skoda = factorySkoda.createTrolleybus();
            Trolleybus volvo = factoryVolvo.createTrolleybus();
            Trolleybus hyundai = factoryHyundai.createTrolleybus();
            Skoda_trolleybuses.add(skoda);
            Volvo_trolleybuses.add(volvo);
            Hyundai_trolleybuses.add(hyundai);
        }

        int totalSkoda = 0;
        int totalVolvo = 0;
        int totalHyundai = 0;

        for (int i = 0; i < A; i++) {
            totalSkoda += Skoda_buses.get(i).getCost() + Skoda_buses.get(i).getUsageCost() * N;
            totalVolvo += Volvo_buses.get(i).getCost() + Volvo_buses.get(i).getUsageCost() * N;
            totalHyundai += Hyundai_buses.get(i).getCost() + Hyundai_buses.get(i).getUsageCost() * N;
        }

        for (int i = 0; i < T; i++) {
            totalSkoda += Skoda_trams.get(i).getCost() + Skoda_trams.get(i).getUsageCost() * N;
            totalVolvo += Volvo_trams.get(i).getCost() + Volvo_trams.get(i).getUsageCost() * N;
            totalHyundai += Hyundai_trams.get(i).getCost() + Hyundai_trams.get(i).getUsageCost() * N;
        }

        for (int i = 0; i < Tr; i++) {
            totalSkoda += Skoda_trolleybuses.get(i).getCost() + Skoda_trolleybuses.get(i).getUsageCost() * N;
            totalVolvo += Volvo_trolleybuses.get(i).getCost() + Volvo_trolleybuses.get(i).getUsageCost() * N;
            totalHyundai += Hyundai_trolleybuses.get(i).getCost() + Hyundai_trolleybuses.get(i).getUsageCost() * N;
        }

        System.out.printf("Skoda - %s\n", totalSkoda);     // 516000000
        System.out.printf("Volvo - %s\n", totalVolvo);     // 541000000
        System.out.printf("Hyundai - %s\n", totalHyundai); // 516500000

    }
}