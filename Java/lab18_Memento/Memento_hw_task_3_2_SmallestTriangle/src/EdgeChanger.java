public class EdgeChanger {

    private Command changeA;
    private Command changeB;
    private Command changeC;

    public void setCommandA(Command command) {
        changeA = command;
    }
    public void setCommandB(Command command) {
        changeB = command;
    }
    public void setCommandC(Command command) {
        changeC = command;
    }

    public void setA(float edge) {
        if (changeA != null) {
            changeA.setEdge(edge);
        }
    }
    public void halfA() {
        if (changeA != null) {
            changeA.halfEdge();
        }
    }
    public void duplicateA() {
        if (changeA != null) {
            changeA.duplicateEdge();
        }
    }
    public void setB(float edge) {
        if (changeB != null) {
            changeB.setEdge(edge);
        }
    }
    public void halfB() {
        if (changeB != null) {
            changeB.halfEdge();
        }
    }
    public void duplicateB() {
        if (changeB != null) {
            changeB.duplicateEdge();
        }
    }
    public void setC(float edge) {
        if (changeC != null) {
            changeC.setEdge(edge);
        }
    }
    public void halfC() {
        if (changeC != null) {
            changeC.halfEdge();
        }
    }
    public void duplicateC() {
        if (changeC != null) {
            changeC.duplicateEdge();
        }
    }

}
