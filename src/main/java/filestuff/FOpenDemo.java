package filestuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FOpenDemo {
    private static final String FILE_NAME = "vehicle.dat";

    public static boolean fileExists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }

    public static boolean fileExists2(String fileName) {
        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "r");
        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = null;

        // determine if testfile.txt exists
        System.out.println("Alternate check for file exists. " + FILE_NAME + " exists? " + fileExists2(FILE_NAME));
        if(fileExists(FILE_NAME)) {
            System.out.println(FILE_NAME + " exists. Not creating for read/write");
        } else {
            System.out.println(FILE_NAME + " does not exist. Creating for read/write");
            file = new RandomAccessFile(FILE_NAME, "rw");
        }

        System.out.println("2nd check for file exists: " + fileExists(FILE_NAME));

        if(file != null) {
            System.out.println("Closing file");
            file.close();
        }
    }
}
