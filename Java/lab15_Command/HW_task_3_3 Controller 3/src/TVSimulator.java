public class TVSimulator {
    public static void main(String[] args) {

        Device tv = new Television();

        RemoteController controller = new RemoteController();

        controller.setCommandOn(new CommandOn(tv));
        controller.setCommandOff(new CommandOff(tv));
        controller.setCommandVolumeUp(new CommandVolumeUp(tv));
        controller.setCommandVolumeDown(new CommandVolumeDown(tv));
        controller.setCommandNextChannel(new CommandNextChannel(tv));
        controller.setCommandPrevChannel(new CommandPrevChannel(tv));

        controller.deviceOn();

        for (int i = 0; i < 30; i++) {
            controller.deviceNextChanel();
        }
        controller.deviceVolumeUp();

        controller.deviceVolumeUp();
        controller.deviceVolumeUp();

        controller.devicePrevChanel();

        controller.deviceVolumeDown();

        controller.deviceOff();


        Device tv2 = new Television();
        RemoteController controller2 = new RemoteController();
        controller2.setCommandOn(new CommandOn(tv2));
        controller2.setCommandOff(new CommandOff(tv2));
        controller2.setCommandVolumeUp(new CommandVolumeUp(tv2));
        controller2.setCommandVolumeDown(new CommandVolumeDown(tv2));
        controller2.setCommandNextChannel(new CommandNextChannel(tv2));
        controller2.setCommandPrevChannel(new CommandPrevChannel(tv2));

        UniversalController universalController = new UniversalController();
        universalController.addContoller(controller);
        universalController.addContoller(controller2);

        universalController.turnAllOn();
        universalController.turnAllOff();

    }
}