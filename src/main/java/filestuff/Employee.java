package filestuff;

import java.util.Arrays;

public class Employee {
    public char [] ssn;
    public char [] fullName;
    public double hourlyRate;
    public W4 w4;

    @Override
    public String toString() {
        return "Employee{" +
                "ssn=" + Arrays.toString(ssn) +
                ", fullName=" + Arrays.toString(fullName) +
                ", hourlyRate=" + hourlyRate +
                ", w4=" + w4 +
                '}';
    }

    public Employee() {
        ssn = new char[10];
        fullName = new char[40];
    }
}
