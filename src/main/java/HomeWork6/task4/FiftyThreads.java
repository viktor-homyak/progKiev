package HomeWork6.task4;

import java.util.ArrayList;
import java.util.List;

/** Parent thead creates 50 threads, waits until they end their existance.
 * Created by Viktor on 03.06.2015.
 */
public class FiftyThreads {

    public static void main(String[] args) {
        ParentThread tread = new ParentThread("ParentThread");

        tread.start();
        tread.interrupt();
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

    private static final class ParentThread extends Thread {

        public ParentThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName());
            for (int i = 0; i < 50; i++) {
                CounterThread thread = new CounterThread("MyThreadCounter" + i);

                thread.start();
                thread.interrupt();
            }
        }
    }
}
