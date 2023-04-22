public class CommandChangeB implements Command {

    final private Triangle triangle;

    public CommandChangeB(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void setEdge(float edge) {
        triangle.setB(edge);
    }
    @Override
    public void halfEdge() {
        triangle.halfB();
    }
    @Override
    public void duplicateEdge() {
        triangle.duplicateB();
    }

}
