public class PostWordDecorator extends BaseDecorator {

    final private String word;

    public PostWordDecorator(Component component, String word) {
        super(component);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }

}