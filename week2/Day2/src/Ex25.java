import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 2 numbers!");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (second <= first) {
            System.out.println("The second number should be bigger!");
        }
        else { for (int i=first; i<=second; i++)
            System.out.println(i);
        }
    }
}