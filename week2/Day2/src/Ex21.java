import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the # of girls and then the boys!");
        int girls = scanner.nextInt();
        int boys = scanner.nextInt();
        int together = (girls + boys);
        if ((together >= 20) && (girls == boys)) {
            System.out.println("The party is excellent!");
        }
        else if (together >= 20){
            System.out.println("The party is cool!");
        }
        else if (girls == 0){
            System.out.println("Sausage Party!");
        }
        else if (together < 20){
            System.out.println("Average party!");
        }

    }
}