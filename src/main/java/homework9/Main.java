package homework9;

/**
 * Created by Viktor on 22.06.2015.
 */
import HomeWork5.Task1.FileSearcher;
import util.Constants;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i <5 ; i++) {
            System.out.println(GetCatalog(Constants.FILE_PATH_LESSON_5).get(i));
        }
    }

        public static ArrayList<String> GetCatalog(String path) throws IOException {
            return  FileSearcher.findFiles(path);
        }

    }



