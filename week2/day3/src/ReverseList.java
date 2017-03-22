import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        System.out.println("Before reversing: "  + Arrays.toString(aj));
        reverse(aj);
    }
    public static void reverse(int[] input) {
        for (int i = 0; i < input.length/2; i++) {
            int b = input[i]; // swap numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = b;
        }
        System.out.println("After reversing: "  + Arrays.toString(input));
    }
}
