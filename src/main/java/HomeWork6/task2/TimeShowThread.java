package HomeWork6.task2;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Viktor on 03.06.2015.
 */
public class TimeShowThread {
    public static void main(String[] args) {
        CounterThread counter = new CounterThread("MyThreadCounter");
        counter.start();
        while (!counter.isInterrupted()) {
            int b;
            try {
                Scanner in = new Scanner(System.in);
                b = in.nextInt();
                if (b == 1) {
                    counter.interrupt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong command was entered. Try again.");
                continue;
            }

        }

    }


    private static class CounterThread extends Thread {

        public CounterThread(String name) {
            super(name);
        }

        @Override
        public void run() {

            while (!isInterrupted()) {
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                System.out.println(sdf.format(cal.getTime()));
                System.out.println("If you want to end program, enter '1'");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

}