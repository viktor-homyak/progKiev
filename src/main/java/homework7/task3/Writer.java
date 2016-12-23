package homework7.task3;

/**
 * Created by Viktor on 08.06.2015.
 */

import java.io.IOException;
import java.io.FileOutputStream;


public class Writer {
    private FileOutputStream s;

    public Writer(FileOutputStream s) {
        this.s = s;
    }

    public void write(byte[] buf) {
        synchronized (s) {
            try {
                s.write(buf);
            } catch (IOException e) {
                return;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        FileOutputStream file = new FileOutputStream("c:\\out.txt");
        Writer writer = new Writer(file);
        CopyThread ct;
        for (int i = 0; i < 10; i++) {
            ct = new CopyThread(writer);
            ct.setName("Thread-" + Integer.valueOf(i));
            ct.start();
        }
    }
}





