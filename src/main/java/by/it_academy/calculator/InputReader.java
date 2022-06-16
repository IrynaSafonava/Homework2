package by.it_academy.calculator;

import java.util.Objects;
import java.util.Scanner;
public class InputReader {
    private Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getNumber() {
        double number;
        while (!scanner.hasNextInt() & !scanner.hasNextDouble()) {
            System.out.print("Provided data is invalid, only integer or double with dot accepted! ");
            scanner.next();
        }
        number = scanner.nextDouble();
        return number;
    }

    public char getOperator() {
        System.out.println("To continue, please input +, -, * or /: ");
        String operator = scanner.next();
        while (operator.length() > 1) {
            System.out.println("Provided data is invalid or too long");
            operator = scanner.next();
            while (operator.charAt(0) != '+' & operator.charAt(0) != '-'
                    & operator.charAt(0) != '*' & operator.charAt(0) != '/') {
                System.out.println("Only +, -, * or / accepted");
                operator = scanner.next();
            }
        }
        return operator.charAt(0);
    }

    public boolean askFurtherAction() {
            System.out.println("Choose any to continue or [0] to exit.");
            String action = scanner.next();
            return !Objects.equals(action, "0");
    }
}
