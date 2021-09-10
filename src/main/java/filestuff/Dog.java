package filestuff;

import java.util.Arrays;

public class Dog {
    public static final int MAX_NAME_SIZE = 10;

    private char dogName[];

    public Dog(String dogName) {
        this.dogName = new char[MAX_NAME_SIZE];
        dogName.getChars(0, dogName.length(), this.dogName, 0);
    }

    public Dog(char [] dogName) {
        this.dogName = new char[MAX_NAME_SIZE];
        System.arraycopy(dogName, 0, this.dogName, 0, dogName.length);
    }

    // returns size in BYTES (72)
    // REMEMBER: chars are 2 bytes in Java. while a vehicle is 36 chars in size, it is 72 bytes
    public static int sizeOf() {
        return 2 * (MAX_NAME_SIZE);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + getDogNameAsString() + '\'' +
                '}';
    }

    public char [] getDogName() {
        return dogName;
    }

    public String getDogNameAsString() {
        StringBuilder returnVal = new StringBuilder();
        for(int i = 0; i < MAX_NAME_SIZE; i++) {
            if(dogName[i] != 0)
                returnVal.append(dogName[i]);
        }
        return returnVal.toString();
    }

    public void setDogName(String dogName) {
        dogName.getChars(0, dogName.length(), this.dogName, 0);
    }
}
