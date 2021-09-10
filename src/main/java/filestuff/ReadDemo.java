package filestuff;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadDemo {
    private static final String TEST_FILE = "dogs.dat";

    public static void main(String[] args) throws IOException {
        if(!FileStuff.fileExists(TEST_FILE)) {
            System.out.println(TEST_FILE + " does not exist");
        }

        RandomAccessFile file = new RandomAccessFile(TEST_FILE, "rw");

        // try to read the dog in slot 3 (ZERO INDEXED)
        int slotNum = 3;
        file.seek(slotNum * Dog.sizeOf());
        // if the first char is zero then that tells us no dog is there
        char [] tempDogName = new char[Dog.MAX_NAME_SIZE];
        for(int i = 0; i < Dog.MAX_NAME_SIZE; i++) {
            tempDogName[i] = file.readChar();
        }

        if (tempDogName[0] == 0) {
            System.out.println("No dog found!");
        } else {
            Dog dog = new Dog(tempDogName);
            System.out.println(dog);
        }

        file.close();
    }
}
