package filestuff;

import java.util.Scanner;

public class CommandDemo {
    public static void main(String[] args) {
        String input = "W 1 11111 10.00 1 S 0.00 Highwater, Helen";
        Employee employee = new Employee();
        Scanner parser = new Scanner(input);

        // skip first 2 tokens, i.e., the command and recNum
        parser.next();
        parser.next();

        employee.ssn = parser.next().toCharArray();
        employee.hourlyRate = parser.nextDouble();
        W4 w4 = new W4();
        w4.exemptionCnt = parser.nextInt();
        w4.filingStatus = parser.next().charAt(0);
        w4.withholdExtra = parser.nextDouble();
        employee.w4 = w4;
        employee.fullName = parser.nextLine().trim().toCharArray();

        System.out.println(employee);
    }
}
