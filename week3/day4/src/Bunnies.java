
public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunny(20));
  }

  public static int bunny(int n) {
    if (n == 1) {
      return 2;
    } else {
      return 2 + bunny(n-1);
    }
  }
}
