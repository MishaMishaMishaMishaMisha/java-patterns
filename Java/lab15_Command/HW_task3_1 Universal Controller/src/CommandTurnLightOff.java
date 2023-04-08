public class CommandTurnLightOff implements Command {

    final private Lamp lamp;

    public CommandTurnLightOff(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.lightOff();
    }

}
