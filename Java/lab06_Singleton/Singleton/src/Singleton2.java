public class Singleton2 {

    int data = 10;
    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {

    }

    void setData(int data) {
        this.data = data;
    }
    int getData() {
        return data;
    }
    static Singleton2 getInstance() {
        return instance;
    }
    public void show() {
        System.out.println("Singleton " + this + " {" + "data=" + data + '}');
    }

}
