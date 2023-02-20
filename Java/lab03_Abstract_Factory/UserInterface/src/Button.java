abstract public class Button {
    protected String name;
    public void setName(String name) {
        this.name = name;
    }
    public void pressButton() {
        System.out.printf("Button %s pressed", name);
    }
}
