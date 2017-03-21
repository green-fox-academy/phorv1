import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 1 number!");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int k = i; k < number; k++) {
                if (k != number -1) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < number; i++) {
            for (int k = i; k < number*2; k++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
            }
            System.out.print(" ");

            System.out.println();
        }
    }
}