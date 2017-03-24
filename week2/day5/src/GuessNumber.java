import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gotANumber = false;
        while (!gotANumber) {
            System.out.println("Please, think of a random number between 0 and 200! Type: \"Got it!\" if you're ready.");
            String userInput = scanner.nextLine();
            if ("Got it!".equals(userInput)) {
                System.out.println("Cool, let's play!");
                gotANumber = true;
            }
        }

        int userInput = scanner.nextInt();
        int a = 0;
        int b = 100;
        int c = userInput;
        boolean d = false;
        while (!d) {
            System.out.println("Is this your number: " + c + "? (Say yes or no)");
            if ("yes".equals(userInput)) {
                d = true;
            } else {
                System.out.println("Is bigger? (Say yes or no)");
                String isItBigger = scanner.nextLine();
                if ("yes".equals(isItBigger)) {
                    a = c;
                    c += (b - a) / 2;
                } else {
                    b = c;
                    c -= (b - a) / 2;
                }
            }
        }
        System.out.println("Cool, " + c + " was a pretty good number to guess, awesome.");
    }
}