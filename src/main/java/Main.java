import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu.startProgramme(scanner);

        int action = Menu.askFurtherAction(scanner);

        while (action >= 0) {
            switch (action) {
                case 0 -> {
                    System.out.println("Closing the programme. Bye-Bye!");
                    scanner.close();
                    action = -1;
                }
                case 1 -> action = Menu.continueProgramme(scanner);
            }
        }
    }
}
