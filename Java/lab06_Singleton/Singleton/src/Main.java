// Singleton - синглтон, который создается только после первого вызова метода getInstange(). Не работает с потоками
// Singleton2 - синглтон, который создается при запуске программы. С потоками работает без проблем
// SingletonThreadSafe1 - синглтон, который корректно работает в многопоточном режиме. Однако, работает медленно.
// SingletonThreadSafe2 - синглтон, который корректно работает в многопоточном режиме. Работает быстро



public class Main {
    public static void main(String[] args) {

//        // 1. синглтон с отложенной инициализацией
//        Singleton.getInstance().show();
//        Singleton.getInstance().setData(5);
//        Singleton.getInstance().show();

//        // 2. синглтон с инициализацией на старте программы
//        Singleton2.getInstance().show();
//        Singleton2.getInstance().setData(5);
//        Singleton2.getInstance().show();


//        // 2. создание обычного синглтона в двух потоках. таким образом создается два разных синглтона что неправильно.
//        Thread thread1 = new Thread(() -> {
//            Singleton instance = Singleton.getInstance();
//            instance.setData(100);
//            instance.show();
//        });
//
//        Thread thread2 = new Thread(() -> {
//            Singleton instance = Singleton.getInstance();
//            instance.setData(500);
//            instance.show();
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        Singleton.getInstance().show();

//        // 3. теперь, запуская программу в разных потоках, всегда будет создаваться один синглтон, но работает медленно
//        Thread thread1 = new Thread(() -> {
//            SingletonThreadSafe1 instance = SingletonThreadSafe1.getInstance();
//            instance.setData(100);
//            instance.show();
//        });
//
//        Thread thread2 = new Thread(() -> {
//            SingletonThreadSafe1 instance = SingletonThreadSafe1.getInstance();
//            instance.setData(500);
//            instance.show();
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        SingletonThreadSafe1.getInstance().show();

        // 4. другой способ реализации синглтона, который работает с потоками и быстрее чем прошлый метод
        Thread thread1 = new Thread(() -> {
            SingletonThreadSafe2 instance = SingletonThreadSafe2.getInstance();
            instance.setData(100);
            instance.show();
        });

        Thread thread2 = new Thread(() -> {
            SingletonThreadSafe2 instance = SingletonThreadSafe2.getInstance();
            instance.setData(500);
            instance.show();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        SingletonThreadSafe2.getInstance().show();

    }
}
