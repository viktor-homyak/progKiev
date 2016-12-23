package HomeWork3.Task2;
import java.math.*;
/**
 * Created only 2 examples.It is not good, but so many work to do next.
 * Created by Виктор on 21.05.2015.
 */


public class BigDecimalDemo {

    public static void main(String[] args) {

        // create 3 BigDecimal objects
        BigDecimal bg1, bg2, bg3;

        MathContext mc = new MathContext(4); // 4 precision

        bg1 = new BigDecimal("2.310");
        bg2 = new BigDecimal("4.620");



        try {
            bg3 = bg1.multiply(bg2, mc);
        }
        catch (ArithmeticException ex){
            System.out.println( ex.getMessage() );
            bg3 = null;
        }
        String str = "Multiplication Result is " +bg3;

        // print bg3 value
        System.out.println( str );


    }
}