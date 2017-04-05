package SumApp;

import java.util.List;

public class Sum {

  public int getSumAll(List<Integer> list) {
    int sumOfAllNumbers = 0;
    for (int i : list) {
      sumOfAllNumbers += i;
    }
    return sumOfAllNumbers;
  }
}
