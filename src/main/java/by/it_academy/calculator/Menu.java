package by.it_academy.calculator;

public class Menu {
    private InputReader inputReader;
    private Calculator calculator;

    public Menu(InputReader inputReader, Calculator calculator) {
        this.inputReader = inputReader;
        this.calculator = calculator;
    }

    public void startProgramme() {
        System.out.print("Please, enter X: ");
        double x = inputReader.getNumber();
        System.out.print("Please, enter Y: ");
        double y = inputReader.getNumber();
        char operator = inputReader.getOperator();
        calculator.calculateResult(operator, x, y);
    }
}
