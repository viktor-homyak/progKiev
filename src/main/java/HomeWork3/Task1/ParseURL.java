package HomeWork3.Task1;

import java.util.Scanner;

/**
 * Created by Виктор on 26.05.2015.
 */
public class ParseURL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input URL adress");
        String Url = in.next();
        System.out.println("Splitting this adress to have an array of nice,clean parameters.... ");

        String[] param = Url.split("&");
        int k = 1;
        int outParam=0;
        for (String block : param) {
            String[] parameter = block.split("=");

            try {
                 outParam = Integer.parseInt(parameter[1]);
                System.out.println("Parameter N" + k + " is " + outParam);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException "+e.getMessage());
                String outParamError = "format error";
                System.out.println("Parameter N" + k + " " + outParamError);
            }
            k++;
        }
    }
}


