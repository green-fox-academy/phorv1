package SortTheArray;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

  public static void main(String[] args) {
    Integer[] givenArray = {1, 2, 3, 4, 5};
    try {
      sortArray(givenArray);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      ;
    }
  }

  public static <T extends Number> void sortArray(T[] inputArray) throws Exception {
    try {
      Arrays.sort(inputArray, Collections.reverseOrder());
      System.out.print("Reversed Array: ");
      for (int i = 0; i < inputArray.length; i++) {
        System.out.print(inputArray[i] + ", ");
      }
    } catch (Exception e) {
      throw new Exception("Something went wrong!");
    }
  }
}

