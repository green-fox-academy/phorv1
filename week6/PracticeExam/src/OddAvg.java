import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
    List<Integer> originalList = Arrays.asList(1, 2, 3, 4);
    double average;

    average = oddAverage(originalList);
    System.out.println(average);

  }

  static double oddAverage(List<Integer> inputList) {
    List<Integer> oddList = new ArrayList<>();
    int sum = 0;
    for (int i = 0; i < inputList.size(); i++) {
      if (inputList.get(i) % 2 == 1) {
        oddList.add(inputList.get(i));
        if (!oddList.isEmpty()) {
          int average = 0;
          for (int j = 0; j < oddList.size(); j++) {
            sum += oddList.get(j);
          }
          return average = sum / oddList.size();
        }
      }
    }
    return sum;
  }
}