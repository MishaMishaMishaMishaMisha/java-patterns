public class HandlerWord extends BaseHandler {

    @Override
    public void open(String fileName) {
        String format = super.getFormat(fileName);
        if (format.equals("doc") || format.equals("docx")) {
            System.out.println("Opening word document \"" + fileName + "\"");
        }
        else {
            super.open(fileName);
        }
    }

}
