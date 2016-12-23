package HomeWork3.Task2;

import java.math.BigDecimal;
import java.math.MathContext;

/**Created only 2 examples.It is not good, but so many work to do next.
 * Created by Виктор on 21.05.2015.
 */


public class MAthContextDemo {

    public static void main(String[] args) {

        // create 3 BigDecimal objects
        BigDecimal bg1, bg2, bg3;
        MathContext mc;
        try { mc = new MathContext(null); // 4 precision
        }
        catch (NullPointerException e){
            System.out.println("Точность должна быть не null");
            mc = new MathContext(0);
        }
        bg1 = new BigDecimal("2.310");
        bg2 = new BigDecimal("4.620");

        // multiply bg1 with bg2 using mc
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