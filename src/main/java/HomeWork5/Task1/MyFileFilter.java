package HomeWork5.Task1;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Alexander Tyshchenko.
 */
public class MyFileFilter implements FilenameFilter {

    private String ext;

    public MyFileFilter(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }

}
