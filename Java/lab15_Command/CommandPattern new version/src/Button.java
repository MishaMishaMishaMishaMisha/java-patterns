public class Button implements Invoker {

    private Command command;
    final private String buttonName;

    public Button(String buttonName) {
        this.buttonName = buttonName;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void press() {
        command.execute(this);
    }
    @Override
    public String getWho() {
        return buttonName;
    }


}
