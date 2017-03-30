
public class Counter {
  public static void main(String[] args) {
    count(6);
  }

  public static int count(int n) {
    if(n == 0){
      return 0;
    }
    else{
      System.out.print(n + " | ");
      return n * count(n - 1);
    }
  }
}
