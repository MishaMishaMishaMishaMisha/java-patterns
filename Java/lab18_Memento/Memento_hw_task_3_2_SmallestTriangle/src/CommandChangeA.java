public class CommandChangeA implements Command {

    final private Triangle triangle;

    public CommandChangeA(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void setEdge(float edge) {
        triangle.setA(edge);
    }
    @Override
    public void halfEdge() {
        triangle.halfA();
    }
    @Override
    public void duplicateEdge() {
        triangle.duplicateA();
    }

}
