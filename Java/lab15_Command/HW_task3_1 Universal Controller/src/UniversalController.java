public class UniversalController {

    private Element topElement = null;

    public void addContoller(Controller controller) {
        Element new_node = new Element(controller);
        if (topElement == null) {
            topElement = new_node;
        }
        else {
            Element current = topElement;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
    }

    public void turnAllOff() {
        Element current = topElement;
        while (current != null) {
            current.controller.off();
            current = current.next;
        }
    }
    public void turnAllOn() {
        Element current = topElement;
        while (current != null) {
            current.controller.on();
            current = current.next;
        }
    }

}
