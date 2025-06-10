import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter 3 test scores: ");
        int a = Scanner.nextInt(), b = Scanner.nextInt(), c = Scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Highest score: " + max);
    }
}
