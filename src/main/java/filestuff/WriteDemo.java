package filestuff;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteDemo {
    private static final String TEST_FILE = "dogs.dat";

    public static void main(String[] args) throws IOException {
        if(FileStuff.fileExists(TEST_FILE)) {
            File tempFile = new File(TEST_FILE);
            tempFile.delete();
        }

        RandomAccessFile file = new RandomAccessFile(TEST_FILE, "rw");

        // make a dog
        Dog dog = new Dog("Fido");
        System.out.println(dog);

        // write the dog to the file in the indicated slot (i.e., rec #, rbn)
        // don't forget in your assignment, you need to account for the HEADER
        int slotNum = 1;
        file.seek(slotNum * dog.sizeOf());
        for (int i = 0; i < dog.getDogName().length; i++) {
            file.writeChar(dog.getDogName()[i]);
        }

        // write another dog
        dog = new Dog("Pierre");
        System.out.println(dog);

        slotNum = 3;
        file.seek(slotNum * dog.sizeOf());
        for (int i = 0; i < dog.getDogName().length; i++) {
            file.writeChar(dog.getDogName()[i]);
        }

        file.close();
    }
}
