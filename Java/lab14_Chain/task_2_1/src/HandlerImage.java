public class HandlerImage extends BaseHandler {

    @Override
    public void open(String fileName) {
        String format = super.getFormat(fileName);
        if (format.equals("jpg") || format.equals("png")) {
            System.out.println("Opening image \"" + fileName + "\"");
        }
        else {
            super.open(fileName);
        }
    }

}
