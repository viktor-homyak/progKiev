package HomeWork6;

/**
 * Created by Viktor on 26.12.2016.
 */
public class DeadLock {
    public static void main(String[] args) {

        final Player player1 = new Player("Josh Smith");
        final Player player2 = new Player("Lebron James");


         new Thread(){
             @Override
             public void run() {
               player1.pass(player2);
             }
         }.start();

        new Thread(){
            @Override
            public void run() {
                player2.pass(player1);
            }
        }.start();

    }


}
