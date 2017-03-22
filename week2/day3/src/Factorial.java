public class Factorial {
    public static void main(String[] args) {
        factorio(6);
    }

    public static void factorio(int number) {
        int number1 = 1;
        for (int i = 1; i < number +1; i++) {
            number1 *= i;
        }
        System.out.println(number1);
    }
}
