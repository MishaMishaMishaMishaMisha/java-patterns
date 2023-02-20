public class LinuxButton extends Button {
    @Override
    public void pressButton() {
        System.out.printf("Linux Button %s pressed\n", name);
    }
}
