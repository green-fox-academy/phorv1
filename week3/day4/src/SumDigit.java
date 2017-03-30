
public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sum(123456));
  }

  public static int sum (int n) {
    if (n < 10) {
      return n;
    } else {
      return (n % 10) + (sum (n/10));
    }
  }
}

