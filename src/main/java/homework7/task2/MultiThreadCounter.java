package homework7.task2;


import java.util.ArrayList;


/**
 * There are two ways concatination of int numbers in array here. We can see that ordinary way of concatination
 * faster than using multi thread. But lots of modifications for each way.
 * Created by Viktor on 07.06.2015.
 */
public class MultiThreadCounter {
    private static int ORDYNARYSUM;
    public static long start;

    public static void main(String[] args) {

        ArrayList<Integer> ListOfInt = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            ListOfInt.add(i);
        }
        start = System.currentTimeMillis();
        Ordinaryconcatenate(ListOfInt);
        System.out.println("Time of Ordinaryconcatenate is: " + (System.currentTimeMillis() - start));
        start = 0;
        System.out.println("--------------------------------------------------------------");
        start = System.currentTimeMillis();

        UseThreadConcatenate(ListOfInt);

        System.out.println(System.currentTimeMillis() - start);
    }

    public static void Ordinaryconcatenate(ArrayList<Integer> listOfInt) {
        for (int x : listOfInt) {
            ORDYNARYSUM = ORDYNARYSUM + x;
            System.out.println(ORDYNARYSUM);
        }
    }

    public static void UseThreadConcatenate(ArrayList<Integer> listOfInt) {
        for (int x : listOfInt) {
            ImplementationThread thread = new ImplementationThread(x);
            thread.start();
        }
    }

}



