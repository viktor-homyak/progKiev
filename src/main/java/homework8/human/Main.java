package homework8.human;

import java.io.*;

import util.Constants;
import java.util.*;


/**
 * Created by Viktor on 12.06.2015.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        final Random RANDOM = new Random();
        ArrayList<String> Names = new ArrayList<>(Arrays.asList("Charlie", "Alex", "Jordan", "Frankie", "Jamie"));
        ArrayList<Integer> Ages = new ArrayList<>(Arrays.asList(28, 25, 41, 18, 65));

        final List<Human.Sex> VALUES =
                Collections.unmodifiableList(Arrays.asList(Human.Sex.values()));
        final int SIZE = VALUES.size();
        Human[] Humans = new Human[5];
        //ToString example
        for (int i = 0; i < 4; i++) {
            Humans[i] = new Human(Names.get(RANDOM.nextInt(Names.size())), Ages.get(RANDOM.nextInt(Ages.size())), VALUES.get(RANDOM.nextInt(SIZE)));
            System.out.println(Humans[i].toString() +"   " + Humans[i].hashCode());

        }
        //equals and clone example;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                if (i==j) continue;
                if (Humans[j].Name.equals(Humans[i].Name)) {
                    if (!Humans[j].sex.equals(Humans[i].sex)) {
                        System.out.println("There is sex orientation problem with " + Humans[j] + "   OR   " + Humans[i]);
                        Humans[j]= (Human) Humans[i].clone();//no problems now

                    }
                }
            }

        }
        //hashcode example
        for (int i = 0; i < 4; i++) {
            System.out.println(Humans[i].toString() + "   " + Humans[i].hashCode());

        }



//        try (FileOutputStream fos = new FileOutputStream(Constants.FILE_PATH_LESSON_8 + "/human.txt");
//             ObjectOutputStream oos = new ObjectOutputStream(fos))
//        {
//            oos.writeObject(Humans[2]);
//            oos.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (InputStream fis = new FileInputStream(Constants.FILE_PATH_LESSON_8 + "/human.txt");

             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Human O = (Human)ois.readObject();
            System.out.println(O.toString());
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();

        }

    }

}