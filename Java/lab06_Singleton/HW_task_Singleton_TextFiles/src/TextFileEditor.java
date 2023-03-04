import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TextFileEditor {

    private static TextFileEditor instance = null;
    private static final Lock lock = new ReentrantLock();
    private String path;

    private TextFileEditor() {

    }

    public static TextFileEditor getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new TextFileEditor();
            }
            lock.unlock();
        }
        return instance;
    }

    public void setFile(String path) {
        this.path = path;
    }
    public void ReadFile() throws Exception {
        FileReader fr = new FileReader(path);
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        fr.close();
    }
    public void WriteLine(String line) throws Exception {
        FileWriter fw = new FileWriter(path, true);
        fw.write("\n" + line);
        fw.close();
    }
    public void DeleteLine(int index) throws Exception {
        FileReader fr = new FileReader(path);
        Scanner scan = new Scanner(fr);
        ArrayList<String> list = new ArrayList<String>();

        int i = 1;
        while (scan.hasNextLine()) {
            if (i == index) {
                scan.nextLine();
            }
            i++;
            list.add(scan.nextLine());
        }

        FileWriter fw = new FileWriter(path);
        for (int k = 0; k < list.size(); k++) {
            fw.write(list.get(k) + "\n");
        }

        fr.close();
        fw.close();
    }

}