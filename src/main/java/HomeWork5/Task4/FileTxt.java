package HomeWork5.Task4;

import HomeWork5.Task1.FileSearcher;

import java.util.List;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import util.Constants;


/**
 * Using class FileSearcher from previous tasks , I have create a file, and wright adreses of files in  to it;
 * Created by Viktor on 31.05.2015.
 */
public class FileTxt {

    public static void main (String[]args){

        try {
            List<String> files = FileSearcher.findFiles(Constants.FILE_PATH_LESSON_5);
            Path p = Paths.get(Constants.FILE_PATH_LESSON_5+"/Example.txt");

            try (OutputStream out = new BufferedOutputStream(
                    Files.newOutputStream(p, CREATE, APPEND)))
            {
                for (String file : files) {
                byte data[] = file.getBytes();
                out.write(data, 0, data.length);}
            }
            catch (IOException x) {
                    System.err.println(x);
                }
            }
         catch (IOException e) {
            e.printStackTrace();
        }
    }


}


