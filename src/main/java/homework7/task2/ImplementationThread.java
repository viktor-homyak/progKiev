package homework7.task2;

/**
 * Created by Viktor on 07.06.2015.
 */
public class ImplementationThread extends Thread {
    private static int SUM;
    private int counter;

    public ImplementationThread(int i) {
        counter = i;
    }

    @Override
    public synchronized void run() {
        SUM = SUM + counter;
        System.out.println("Our current counter is:" + counter + " and current sum is: " + SUM);
    }

    public int getSum() {
        return SUM;
    }
}
