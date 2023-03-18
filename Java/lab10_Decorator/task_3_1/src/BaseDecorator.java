public class BaseDecorator implements Component {

    final protected Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void print() {
        wrappee.print();
    }

}
