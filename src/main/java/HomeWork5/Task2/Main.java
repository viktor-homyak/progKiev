package HomeWork5.Task2;


import java.io.IOException;
import java.io.RandomAccessFile;
import util.Constants;

/**
 * Created by Viktor on 30.05.2015.
 */
public  class Main {
    public static void main (String[]args) throws IOException {

        String s = null;
        String path = Constants.FILE_PATH_LESSON_5 +"/2.txt";

        System.out.println("Open file "+ path);
        System.out.println("Ok. What we have here?");
    s = ReadFile(path);
        System.out.println(s);
        System.out.println("change Hello -> 1234");
    s= s.replace("Hello","1234");

    WriteToFile(path,s);
        System.out.println("Checking things to be done");
        System.out.println(ReadFile(path));

}
    public static String ReadFile(String path) throws IOException {
        RandomAccessFile file = new RandomAccessFile(path, "rw");
        try {
            byte b[] = new byte[(int)file.length()];
             file.read(b);
            String s = new String(b);
            return s;
        } finally {
            file.close();
        }
    }

    public static void  WriteToFile(String path, String text) throws IOException   {
            RandomAccessFile file = new RandomAccessFile(path, "rw");
        try {
            file.setLength(0);
            byte[]tofile = text.getBytes();
            file.write(tofile);
        } finally {
            file.close();
        }
    }
}




