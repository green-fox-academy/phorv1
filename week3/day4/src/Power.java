
public class Power {
  public static void main(String[] args) {
    System.out.println(power(10,3));
  }

  public static int power (int n, int p) {
    if (p == 1) {
      return n;
    }else {
      return n * power(n, p -1);
    }
  }
}
