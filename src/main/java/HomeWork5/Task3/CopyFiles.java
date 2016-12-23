package HomeWork5.Task3;


import java.io.File;

/**
 * Copy files from one directory to another
 * Created by Viktor on 30.05.2015.
 */

public class CopyFiles {
    public static void main(String[] args) {
        String path = "C:\\Users\\Viktor\\IdeaProjects\\Prog\\src\\resourses\\HomeWork5";
        File dir = new File(path);
        File[] files = dir.listFiles();

        try {
            for (File instance : files) {
                String name = instance.getName();
                File newFile = new File(path + "\\Copy\\" + name);
                newFile.createNewFile();
            }

        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }

    ;
}
