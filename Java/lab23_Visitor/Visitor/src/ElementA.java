public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void featureA(){
        System.out.println("ElementA: featureA");
    }
}