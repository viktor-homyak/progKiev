package HomeWork4.Task4;

/**
 * This new class give us possibility to monitor creation of several files
 * Created by Виктор on 28.05.2015.
 */
public class MonitorArray {

    public MonitorArray( Monitor[] arr ){
        for (int i = 0; i < arr.length; i++) {
           arr[i].start();
        }
    }
}
