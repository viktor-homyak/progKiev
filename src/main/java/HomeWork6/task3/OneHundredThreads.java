package HomeWork6.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates 100 treats, prints them, and then interrupt.
 * Created by Viktor on 03.06.2015.
 */
public class OneHundredThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            CounterThread thread = new CounterThread("MyThreadCounter" + i);
            thread.start();
            thread.interrupt();
        }
    }

    private static final class CounterThread extends Thread {

        public CounterThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName());
        }
    }
}
