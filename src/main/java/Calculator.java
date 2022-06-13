public class Calculator {

    public static void calculateResult(char operator, double x, double y) {
        switch (operator) {
            case '+':
                System.out.println("The result of summarizing " + x + " and " + y + " is "
                        + Calculator.toSummarize(x, y));
                break;
            case '*':
                System.out.println("The result of multiplication " + x + " by " + y + " is "
                        + Calculator.toMultiply(x, y));
                break;
            case '-':
                System.out.println("The result of subtraction " + y + " from " + x + " is "
                        + Calculator.toSubtract(x, y));
                break;
            case '/':
                if (y == 0) {
                    System.out.println("You should not divide a number by zero");
                } else {
                    System.out.println("The result of division " + x + " by " + y + " is "
                            + Calculator.toDivide(x, y));
                }
                break;
            default:
                System.out.println("Provided data is invalid");
        }
    }

    public static double toSummarize(double x, double y) {
        return x + y;
    }

    public static double toMultiply(double x, double y) {
        return x * y;
    }

    public static double toSubtract(double x, double y) {
        return x - y;
    }

    public static double toDivide(double x, double y) {
        return x / y;
    }
}