public class HandlerAdobe extends BaseHandler {

    @Override
    public void open(String fileName) {
        String format = super.getFormat(fileName);
        if (format.equals("pdf")) {
            System.out.println("Opening pdf file \"" + fileName + "\"");
        }
        else {
            super.open(fileName);
        }
    }

}
