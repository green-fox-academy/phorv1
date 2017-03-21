import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 1 number!");
        int number = scanner.nextInt();
        for (int i = 0; i < number * 2; i += 2) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}