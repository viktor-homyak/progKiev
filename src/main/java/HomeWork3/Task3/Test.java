package HomeWork3.Task3;

import HomeWork3.Task4.MyException;

import java.util.Scanner;

/**
 * Написать аналог Integer.parseInt. Использовать исключения.
 * Created by Viktor on 27.05.2015.
 *
 * Parser transform string of digits to a number that is sum of this digits
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number below:");
        String Url = in.next();
       try{ int newInt = MyInteger.IntSumOfDigits(Url);
           System.out.println("My parser transform string of digits to a number that is sum of this digits");
           System.out.println("Number is: " + newInt);
       }
       catch (MyException ex){System.err.print(ex); }

    }
}
