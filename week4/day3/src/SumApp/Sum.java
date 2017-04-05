package SumApp;

import java.util.List;

public class Sum {

  public int getSumAll(List<Integer> list) {
    int sumOfAllNumbers = 0;
    if (list == null) {
      return 0;
    } else {
      for (int i : list) {
        sumOfAllNumbers += i;
      }
      return sumOfAllNumbers;
    }
  }
}
