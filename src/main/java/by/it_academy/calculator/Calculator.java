package by.it_academy.calculator;

public class Calculator {

    public void calculateResult(char operator, double x, double y) {
        switch (operator) {
            case '+':
                System.out.println("The result of summarizing " + x + " and " + y + " is "
                        + toSummarize(x, y));
                break;
            case '*':
                System.out.println("The result of multiplication " + x + " by " + y + " is "
                        + toMultiply(x, y));
                break;
            case '-':
                System.out.println("The result of subtraction " + y + " from " + x + " is "
                        + toSubtract(x, y));
                break;
            case '/':
                try {
                    System.out.println("The result of division " + x + " by " + y + " is "
                            + toDivide(x, y));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Provided data is invalid");
        }
    }

    public double toSummarize(double x, double y) {
        return x + y;
    }

    public double toMultiply(double x, double y) {
        if(x == 0 | y == 0) {
            return Math.abs(x * y);
        }
        return x * y;
    }

    public double toSubtract(double x, double y) { return x - y; }

    public double toDivide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0. Not allowed to divide a number by zero");
        }
        return x / y;
    }
}