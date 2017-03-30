
public class BunniesAgain {
  public static void main(String[] args) {
    System.out.println(bunnies(10));
  }

  public static int bunnies(int n) {
    int sum = 0;
    if (n == 0) {
      return 0;
    } else {
      if (n % 2 == 0) {
        sum = 2 + bunnies(n-1);
      } else if (n % 2 != 0) {
        sum = 3 + bunnies(n-1);
      }
      return sum;
    }
  }
}
