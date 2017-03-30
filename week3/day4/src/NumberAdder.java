
public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(add(6));
  }

  public static int add(int n) {
    if (n == 0) {
      return 0;
    } else {
      int result = n + add(n - 1);
      return result;
    }
  }
}