public class CommandTurnLightOn implements Command {

    final private Lamp lamp;

    public CommandTurnLightOn(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.lightOn();
    }

}
