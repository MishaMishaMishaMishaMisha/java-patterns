public class Client {
    public static void main(String[] args) {

        Request[] requests = {
                new Request(Request.Type.TYPE1),
                new Request(Request.Type.TYPE2),
                new Request(Request.Type.TYPE1),
                new Request(Request.Type.TYPE3),
                new Request(Request.Type.TYPE4),
                new Request(Request.Type.TYPE2),
                new Request(Request.Type.TYPE4),
                new Request(Request.Type.TYPE1),
        };

        Handler handler1 = new HandlerType1();
        Handler handler2 = new HandlerType2();
        Handler handler3 = new HandlerType3();
        Handler handler4 = new HandlerType4();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler4);

        for (Request request : requests) {
            handler1.handle(request);
        }

    }
}
