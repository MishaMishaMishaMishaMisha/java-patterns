public class SingletonThreadSafe1 {

    int data = 10;
    private static SingletonThreadSafe1 instance = null;

    private SingletonThreadSafe1() {

    }

    void setData(int data) {
        this.data = data;
    }
    int getData() {
        return data;
    }
    synchronized public static SingletonThreadSafe1 getInstance() {
        if (instance == null) {
            System.out.println("Creation Singleton");
            instance = new SingletonThreadSafe1();
        }
        return instance;
    }
    public void show() {
        System.out.println("Singleton " + this + " {" + "data=" + data + '}');
    }
}
