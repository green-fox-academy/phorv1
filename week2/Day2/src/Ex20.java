import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 2 numbers and divide them with a space or an enter!");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("This is the higher number: " + number1);
        }
        else {
            System.out.println("This is the higher number: " + number2);
        }
    }
}