package HomeWork4.Task1;

import java.util.Arrays;

/**
 * @author Alexander Tyshchenko.
 * modif by Viktor
 */
public class HumanComparatorSorting {

    public static void main(String[] args) {
        Human[] humans = {
                new Human(40),
                new Human(20),
                new Human(3),
                new Human(7)
        };

        Arrays.sort(humans, new HumanComparator());

        for (Human h : humans)
            System.out.println(h.getAge());

//        Java 8
//        Arrays.stream(humans)
//                .sorted(new HumanComparator())
//                .forEach((h) -> System.out.println(h.getAge()));

    }

}
