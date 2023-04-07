public class HandlerExcel extends BaseHandler {

    @Override
    public void open(String fileName) {
        String format = super.getFormat(fileName);
        if (format.equals("xls") || format.equals("xlsx")) {
            System.out.println("Opening excel file \"" + fileName + "\"");
        }
        else {
            super.open(fileName);
        }
    }

}
