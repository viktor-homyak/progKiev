package HomeWork6;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by Viktor on 26.12.2016.
 */
public class Player {
    public String name;


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void pass(Player player){


        System.out.println(name+ " pass the ball to"+ player.getName());

           player.passBack(this);


    }

    public synchronized void passBack(Player player ){
        String[] variants = {"success", "failure",};

        Random random = new Random();

        System.out.println(player.name +" has passed the ball back, with status " + variants[random.nextInt(variants.length)]);


    }



}
