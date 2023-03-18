public class Main {

    public static void main(String[] args) {

        //PrintableString hello = new PrintableString("Hello, World!");
        //hello.print();

        Component expression = new PrintableString("");
        expression = new PostWordDecorator(expression, "Hello");
        expression = new PostComaDecorator(expression);
        expression = new PostWordDecorator(expression, "world");
        expression = new PostExclaimDecorator(expression);
        expression = new PostEndlDecorator(expression);
        expression.print();


    }

}
