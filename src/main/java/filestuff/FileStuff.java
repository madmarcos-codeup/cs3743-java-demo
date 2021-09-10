package filestuff;

import java.io.File;

public class FileStuff {

    public static boolean fileExists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }

}
