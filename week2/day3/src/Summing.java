public class Summing {
    public static void main(String[] args) {
        sum(12);
    }

    public static void sum(int sum1) {
        int number = 0;
        for (int i = 0; i < sum1 +1; i++) {
            number += i;
        }
        System.out.println(number);
    }
}
