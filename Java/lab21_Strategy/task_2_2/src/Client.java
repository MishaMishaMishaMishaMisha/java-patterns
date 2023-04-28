public class  Client {

    public static void main(String[] args) {
        File file = new File("test.pdf");
        file.setEncryption(new RSAEncryption());
        file.encrypt();
    }

}
