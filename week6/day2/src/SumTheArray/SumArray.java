package SumTheArray;

public class SumArray {

  public static void main(String[] args) {
    Integer[] givenArray = {1, 2, 3, 4, 5};
    try {
      System.out.println("The sum is: " + sumArray(givenArray, 10));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static <T extends Number> double sumArray(T[] inputArray, int length) throws Exception {
    double sum = 0;
    try {
      for (int i = 0; i < length; i++) {
        T elemts = inputArray[i];
        sum += elemts.doubleValue();
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new Exception("Length is out of bond! Current length is: " + inputArray.length);
    }
    return sum;
  }
}

