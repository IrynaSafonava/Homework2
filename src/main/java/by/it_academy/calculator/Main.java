package by.it_academy.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputReader inputReader = new InputReader(scanner);
        Calculator calculator = new Calculator();
        Menu menu = new Menu(inputReader, calculator);

        while (true) {
            menu.startProgramme();
            if (!inputReader.askFurtherAction()) {
                System.out.println("Closing the programme. Bye-Bye!");
                scanner.close();
                break;
            }
        }
    }
}
