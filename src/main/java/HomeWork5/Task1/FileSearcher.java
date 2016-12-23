package HomeWork5.Task1;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import util.Constants;

/**
 * I overrided method findFiles for possibility to use it with another parameters.
 * For example to use as a parameter list of file extentions instead of just one extention.
 *
 *
 */
public class FileSearcher {

    public static List<String> findFiles(String srcPath, String ext) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext));

        List<String> listFiles = new ArrayList<>(files.length);

        for (int i = 0; i < files.length; i++) {
            listFiles.add(srcPath + files[i].getName());
        }

        return listFiles;
    }
    public static List<String> findFiles(String srcPath, List<String> listext) throws IOException {
        List<String> listFiles = new LinkedList<>();
        for ( String ext: listext) {
            File dir = new File(srcPath);
            File[] files = dir.listFiles(new MyFileFilter(ext));

            List<String> listFilesLocal = new ArrayList<>(files.length);

            for (int i = 0; i < files.length; i++) {
                listFilesLocal.add(srcPath + files[i].getName());
            }
            listFiles.addAll(listFilesLocal);
        }

        return listFiles;
    }
    //Use in Task4
    public static ArrayList<String> findFiles(String srcPath) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles();

        ArrayList<String> listFiles = new ArrayList<>(files.length);

        for (int i = 0; i < files.length; i++) {
            listFiles.add(srcPath + files[i].getName());
        }

        return listFiles;
    }

    public static void main(String[] args) {

        try {
            List<String> listext = new LinkedList<>();
            listext.add(".txt");
            listext.add(".doc");
            listext.add(".jpg");
            List<String> files = findFiles(Constants.FILE_PATH_LESSON_5, listext);
            for (String file : files) {
                System.out.println(file);
            }
            // JAVA 8
            //files.forEach((file) -> System.out.println(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
