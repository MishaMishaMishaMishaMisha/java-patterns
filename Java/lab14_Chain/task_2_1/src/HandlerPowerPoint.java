public class HandlerPowerPoint extends BaseHandler {

    @Override
    public void open(String fileName) {
        String format = super.getFormat(fileName);
        if (format.equals("pptx")) {
            System.out.println("Opening PowerPoint file \"" + fileName + "\"");
        }
        else {
            super.open(fileName);
        }
    }

}
