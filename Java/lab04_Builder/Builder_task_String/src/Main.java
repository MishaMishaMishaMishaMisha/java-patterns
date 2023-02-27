public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .setString("aaa")
                .addString("bb")
                .insertString("cc", 2);
        String string = stringBuilder.build();

        System.out.println(string); // aaccabb

    }
}