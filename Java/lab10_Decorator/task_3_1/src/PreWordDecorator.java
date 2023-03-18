public class PreWordDecorator extends BaseDecorator {

    final private String word;

    public PreWordDecorator(Component component, String word) {
        super(component);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }

}