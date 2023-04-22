public class CommandChangeC implements Command {

    final private Triangle triangle;

    public CommandChangeC(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void setEdge(float edge) {
        triangle.setC(edge);
    }
    @Override
    public void halfEdge() {
        triangle.halfC();
    }
    @Override
    public void duplicateEdge() {
        triangle.duplicateC();
    }

}
