public class BaseHandler implements Handler {

    private Handler next = null;

    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void open(String fileName) {
        if (next != null) {
            next.open(fileName);
        }
        else {
            System.out.println("Unknown format \"" + fileName + "\"");
        }
    }

    final public String getFormat(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

}