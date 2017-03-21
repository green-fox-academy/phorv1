import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 1 number!");
        int number = scanner.nextInt();
        for (int i= 0; i < 15; i++) {
            System.out.println(i + " * " + number + " = " + (i*number));
        }
        }
    }