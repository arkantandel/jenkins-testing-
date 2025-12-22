import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1; // 1 to 10
        int guess = 0;
        int attempts = 0;

        System.out.println("🎮 Welcome to Guess The Number Game!");
        System.out.println("Guess a number between 1 and 10");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("⬇ Too High!");
            } else if (guess < secretNumber) {
                System.out.println("⬆ Too Low!");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
