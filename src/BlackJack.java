import java.util.Scanner;

public class BlackJack {
    private int a;
    private int b;

    public BlackJack(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public BlackJack(){}

    //    public int compare(int a, int b) {
    public int compare() {
        if (a > 21 && b > 21) {
            return 0;
        } else if (Math.max(a, b) > 21){
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }
    }

    public void startUp() {
        Scanner scanner = new Scanner(System.in);

        int[] cards = new int[2];

        System.out.println("You will need to choose two positive numbers.");
        for (int i = 0 ; i < cards.length ; i++) {
            do {
                System.out.println("Please select number " + (i +1) + ":");
                cards[i] = scanner.nextInt();
            } while (cards[i] <= 0);
        }

//        scanner.close();

        BlackJack blackJack = new BlackJack(cards[0], cards[1]);
        System.out.println(blackJack.compare());
    }
}
