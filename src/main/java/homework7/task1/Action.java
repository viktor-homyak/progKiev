package homework7.task1;

/**
 * Created by Viktor on 05.06.2015.
 */



    public class Action extends Thread {
        Account acc;
        int withdraw;
        public Action(Account acc, int withdraw) {
            this.acc = acc;
            this.withdraw= withdraw;
        }
        public void run() {
            try {
                Thread.sleep(System.currentTimeMillis() % 100);
            } catch (InterruptedException e) {}
            synchronized (acc) {
                int has = acc.get();
                if (has > 100) {
                    acc.set(acc.get() - withdraw);
                }
                System.out.println(has);
            }
        }
    }
