import java.util.Scanner;
public class InputReader {

    public static double getNumber(Scanner scanner) {
        double number;
        while (!scanner.hasNextInt() & !scanner.hasNextDouble()) {
            System.out.print("Provided data is invalid, only integer or double with dot accepted! ");
            scanner.next();
        }
        number = scanner.nextDouble();
        return number;
    }

    public static char getOperator(Scanner scanner) {
        System.out.println("To continue, please input +, -, * or /:");
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
}
