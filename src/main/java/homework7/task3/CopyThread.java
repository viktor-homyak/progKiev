package homework7.task3;

/**
 * Created by Viktor on 08.06.2015.
 */
public class CopyThread extends Thread {
    private Writer w;

    public CopyThread(Writer w) {
        this.w = w;
    }

    public void run() {
        try {
            Thread.sleep(System.currentTimeMillis() % 5000);
        } catch (InterruptedException e1) {
            return;
        }
        String myName = getName();
        byte[] nameBytes = myName.getBytes();
        w.write(nameBytes);
    }
}