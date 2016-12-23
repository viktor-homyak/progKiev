package HomeWork4.Task1;

import java.util.Comparator;

/**
 * Sorting in return direction
 * @author Alexander Tyshchenko.
 * modif by Viktor
 */
public class HumanComparator implements Comparator<Human> {

    @Override
    public int compare(Human human1, Human human2) {
        if (human1.getAge() < human2.getAge())
            return 1;
        else if (human1.getAge() == human2.getAge())
            return 0;
        else if (human1.getAge() > human2.getAge())
            return -1;
        return 0;
    }

}
