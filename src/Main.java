import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    throws java.io.IOException {
//        BlackJack blackJack = new BlackJack();
//        blackJack.startUp();
        char choice;
// TO BE WOKDED ON:
        do {
//            Scanner sc = new Scanner(System.in);
            System.out.println("Please select an option form the menu: ");
            System.out.println("\t1. Blackjack");
            System.out.println("\tq. Exit Game");
            choice = (char) System.in.read();
//            sc.reset();
            switch (choice) {
                case 'q':
                    System.out.println("End.");
                    break;
                case '1':
                    System.out.println("Choice is: " + choice);
                    BlackJack blackJack = new BlackJack();
                    blackJack.startUp();
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;
            }
        } while (choice != 'q');

        // PERSON TEST;
//        Person b = new Person("Bob", "Marley", LocalDate.parse("1989-05-30"));
//        System.out.println(b.getDateOfBirth());
    }
}