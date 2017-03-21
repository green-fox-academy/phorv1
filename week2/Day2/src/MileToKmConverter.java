import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Type distance in km");

        int km = scanner.nextInt();
        double mile = (km * 0.62);
        System.out.println("Distance in mile is: " + mile);
    }
}