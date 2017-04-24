package Calculator;

import TwentyPlusOne.Game;
import sun.net.www.content.text.Generic;

public class Calculator {

  static <T extends Number> T add(T... numbers) {
    Double sum = Double.valueOf(0);
    int i = 0;
    while (i < numbers.length) {
      T elements = numbers[i];
      sum += elements.doubleValue();
      i++;
    }
    return (T) sum;
  }

  static <T extends Number> T subtract(T... numbers) {
    Double sum = Double.valueOf(0);
    int i = 0;
    while (i < numbers.length) {
      T elemts = numbers[i];
      sum -= elemts.doubleValue();
      i++;
    }
    return (T) sum;
  }

  static <T extends Number> void miltiply() {
  }

  static <T extends Number> void divide() {
  }

}

