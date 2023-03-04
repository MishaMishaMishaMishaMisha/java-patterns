import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonThreadSafe2 {

    int data = 10;
    private static SingletonThreadSafe2 instance = null;
    private static final Lock lock = new ReentrantLock();

    private SingletonThreadSafe2() {

    }

    void setData(int data) {
        this.data = data;
    }
    int getData() {
        return data;
    }
    public static SingletonThreadSafe2 getInstance() {
        // Когда два потока запустят этот метод, один из них первый пройдет if и закроет замок.
        // Пока второй поток будет ждать перед замком, первый создаст синглтон и после этого откроет замок.
        // Второй поток зайдет и во втором if узнает что синглтон уже создан и не будет его снова создавать.
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                System.out.println("Creation Singleton");
                instance = new SingletonThreadSafe2();
            }
            lock.unlock();
        }
        return instance;
    }
    public void show() {
        System.out.println("Singleton " + this + " {" + "data=" + data + '}');
    }

}
