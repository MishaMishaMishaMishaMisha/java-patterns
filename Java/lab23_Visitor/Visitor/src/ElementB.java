public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void featureB() {
        System.out.println("ElementB: featureB");
    }
}