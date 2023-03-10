public class Singleton {

    int data = 10;
    private static Singleton instance = null;

    private Singleton() {

    }

    void setData(int data) {
        this.data = data;
    }
    int getData() {
        return data;
    }
    static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creation Singleton");
            instance = new Singleton();
        }
        return instance;
    }
    public void show() {
        System.out.println("Singleton " + this + " {" + "data=" + data + '}');
    }

}
