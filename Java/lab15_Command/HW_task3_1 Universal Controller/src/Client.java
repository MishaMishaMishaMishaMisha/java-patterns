public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();

        controllerKitchenLamp.setCommandOn(new CommandTurnLightOn(kitchenLamp));
        controllerKitchenLamp.setCommandOff(new CommandTurnLightOff(kitchenLamp));
        controllerHallLamp.setCommandOn(new CommandTurnLightOn(hallLamp));
        controllerHallLamp.setCommandOff(new CommandTurnLightOff(hallLamp));
        controllerBedroomLamp.setCommandOn(new CommandTurnLightOn(bedroomLamp));
        controllerBedroomLamp.setCommandOff(new CommandTurnLightOff(bedroomLamp));
        controllerBathroomLamp.setCommandOn(new CommandTurnLightOn(bathroomLamp));
        controllerBathroomLamp.setCommandOff(new CommandTurnLightOff(bathroomLamp));

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();


        UniversalController uc = new UniversalController();
        uc.addContoller(controllerKitchenLamp);
        uc.addContoller(controllerHallLamp);
        uc.addContoller(controllerBedroomLamp);
        uc.addContoller(controllerBathroomLamp);

        System.out.println("\n");
        uc.turnAllOff();
        uc.turnAllOn();

    }
}