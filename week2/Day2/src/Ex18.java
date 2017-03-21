import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Yaay your number is Even!");
        }
            else {
            System.out.println("Yaay your number is Odd!");
        }
    }
}