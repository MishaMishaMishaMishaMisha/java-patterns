public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
                "textfile.txt"
        };

        Handler handlerImage = new HandlerImage();
        Handler handlerAdobe = new HandlerAdobe();
        Handler handlerExcel = new HandlerExcel();
        Handler handlerWord = new HandlerWord();
        Handler handlerPowerPoint = new HandlerPowerPoint();

        handlerImage.setNext(handlerAdobe);
        handlerAdobe.setNext(handlerExcel);
        handlerExcel.setNext(handlerWord);
        handlerWord.setNext(handlerPowerPoint);

        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            handlerImage.open(file);
        }


    }
}
