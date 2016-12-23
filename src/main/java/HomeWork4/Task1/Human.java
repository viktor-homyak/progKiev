package HomeWork4.Task1;

/**
 * @author Alexander Tyshchenko.
 *modif by Viktor
 */
public class Human {

    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }
}
