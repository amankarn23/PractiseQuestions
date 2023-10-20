import java.util.Scanner;
public class Bellsofpilgimage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Number of bells
            int X = scanner.nextInt(); // Number of first bells to increase mana by 10
            int K = scanner.nextInt(); // Number of bells rung so far
            int P = scanner.nextInt(); // Initial mana level

            int remainingBells = N - K;
            int manaIncrease = (remainingBells > X) ? (X * 10 + (remainingBells - X) * 5) : (remainingBells * 10);
            int totalMana = P + manaIncrease + ((remainingBells == 0) ? 20 : 0);

            System.out.println(totalMana);
        }
    }
}
