import java.util.Scanner;

public class HelloUs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Your Name");

        String helloUs = scanner.nextLine();
        System.out.println("Hello " + helloUs + "!");
    }
}