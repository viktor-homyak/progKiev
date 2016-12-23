package HomeWork6.Task1;

/** Program shows printing of sequence of numbers from given interval [1,23] for 5 seconds
 * Created by Viktor on 02.06.2015.
 */
public class Main {
    public static class Counter extends Thread {
        int first;
        int last;

        public Counter(int first, int last) {
            super();
            this.first = first;
            this.last = last;
        }

        public void run() {

            while (!isInterrupted()) {
                for (int i = this.first; i < this.last; i++) {
                    System.out.println(i);
                }
                try {
                    Thread.sleep(1000);
                    Thread.yield();
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            Counter c = new Counter(1, 23);
            c.start();
            Thread.sleep(5000);
            c.interrupt();
        } catch (Exception e) {
            ;
        }
    }
}
