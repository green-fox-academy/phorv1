import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Type the number of your chickens");
        int chickens = scanner.nextInt();
        System.out.println("Number of chickens you have: " + chickens);

        System.out.println("Please Type the number of your pigs");
        int pigs = scanner.nextInt();
        System.out.println("Number of pigs you have: " + pigs);

        int chickLegs = (chickens * 2);
        int pigLegs = (pigs * 4);
        int legs = (chickLegs + pigLegs);
        System.out.println("Number of all animal legs: " + legs);

    }
}