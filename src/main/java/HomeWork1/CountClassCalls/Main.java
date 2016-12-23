package HomeWork1.CountClassCalls;

/**
 * Created by Viktor on 18.05.2015.
 */
public class Main {
    public static void main(String[] Args){
        System.out.println("Вызовем класс Тест 10 раз");
       int n = 10;
        while ( n -- >0){
        new Test();
    }
        System.out.println("Мы получили " + Test.count + " вызовов.");
}
}
