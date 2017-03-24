import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int smallNumber, bigNumber, lives, autRandomNum, guess;
        System.out.print("Guess my chosen number!\n");
        System.out.print("Enter a between range:");
        Scanner scanner = new Scanner(System.in);
        smallNumber = scanner.nextInt();
        bigNumber = scanner.nextInt();
        System.out.print("Add lives: ");
        lives = scanner.nextInt();
        if (lives <= 0) {
            System.out.println("You can't have negative lives!\nAdd lives: ");
            lives = scanner.nextInt();
        }
        autRandomNum = smallNumber + (int) (Math.random() * bigNumber);
        System.out.println("Random number: (" + autRandomNum + ")");
        while (lives > 0) {
        String range = "(" + smallNumber + ")-(" + bigNumber + ")";
            System.out.println("Guess now: [between:(" + range + ")]");
            guess = scanner.nextInt();
            String notInRange = "Your guess:(" + guess + ") isn't within the range of " + range;
           if (guess == autRandomNum) {
                System.out.println("You Won!");
               System.exit(0);
            } else if (guess > autRandomNum) {
                lives -= 1;
                String livesLeft = lives + " lives left)";
                System.out.println("Number is smaller (" + livesLeft);
                if (guess > bigNumber){
                    System.out.println(notInRange);
                } else {bigNumber = guess;}
            } else if (guess < autRandomNum) {
                lives -= 1;
                String livesLeft = lives + " lives left)";
                System.out.println("Number is bigger (" + livesLeft);
                if (guess < smallNumber){
                    System.out.println(notInRange);
                } else {smallNumber = guess;}
            }
        }
        System.out.println("You Lost!");
    }
}
