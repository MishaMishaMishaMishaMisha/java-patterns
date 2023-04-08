public class Client {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        Command commandOn = new CommandTurnLightOn(lamp);
        Command commandOff = new CommandTurnLightOff(lamp);

        Controller controller = new Controller();
        controller.setCommandOn(commandOn);
        controller.setCommandOff(commandOff);

        // Simulation
        controller.on();
        controller.on();
        controller.off();
        controller.off();
        controller.on();
        controller.on();
        controller.off();

    }
}