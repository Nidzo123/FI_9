import java.util.Random;
import java.util.Scanner;

public class FI_9 {
    public static void main(String[] args) {
        Random random = new Random();
        char letter = (char) (random.nextInt(26) + 'A');
        Scanner scanner = new Scanner(System.in);
        int numTries = 0;

        System.out.println("Guess a letter between A and Z:");

        while (true) {
            char guess = scanner.next().toUpperCase().charAt(0);
            numTries++;

            if (guess == letter) {
                System.out.println("Congratulations, you guessed the letter " + letter + " in " + numTries + " tries!");
                break;
            } else {
                System.out.println("Wrong letter, try again.");
            }
        }
    }
}