public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        factory = new LinuxFactory();
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.pressButton();
        checkBox.setChecked(false);

    }
}