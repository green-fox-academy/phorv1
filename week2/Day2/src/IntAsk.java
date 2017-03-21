import java.util.Scanner;

public class IntAsk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Type a random number");
        int random = scanner.nextInt();
        System.out.println("Please Type your favourite number");
        int favourite = scanner.nextInt();
        System.out.println("Please Type a number between 10 and 1000");
        int between = scanner.nextInt();
        System.out.println("Please Type an even number");
        int even = scanner.nextInt();
        System.out.println("Please Type an odd number");
        int odd = scanner.nextInt();

        int sum = (random + favourite + between + even + odd);
        double average =(sum / 5);
        System.out.println("Sum: " + sum + "," + " Average: " + average);

    }
}