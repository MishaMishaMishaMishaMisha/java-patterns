public class Element {

    public RemoteController controller;
    public Element next = null;

    public Element(RemoteController controller) {
        this.controller = controller;
    }

}
