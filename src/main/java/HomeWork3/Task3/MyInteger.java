package HomeWork3.Task3;

import HomeWork3.Task4.MyException;

/**
 * This class works not only for the Task3 of home work, but also for Task4
 * Created by Viktor on 27.05.2015.
 */

public  class MyInteger {
    public static int IntSumOfDigits(String s) throws MyException {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            if( isInteger(String.valueOf(s.charAt(i)))) {
                throw new MyException();
            }
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }

   //Download this code from i-net
    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }
    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }



}
