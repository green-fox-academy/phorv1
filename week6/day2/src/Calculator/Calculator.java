package Calculator;

import TwentyPlusOne.Game;
import sun.net.www.content.text.Generic;

public class Calculator {

  static <T extends Number> T add(T... numbers) {
    Double sum = Double.valueOf(0);
    for (int i = 0; i < numbers.length; i++) {
      T elements = numbers[i];
      sum += elements.doubleValue();
    }
    return (T) sum;
  }

  static <T extends Number> T subtract(T... numbers) {
    Double sum = Double.valueOf(0);
    for (int i = 0; i < numbers.length; i++) {
      T elemts = numbers[i];
      sum -= elemts.doubleValue();
    }
    return (T) sum;
  }

  static <T extends Number> void miltiply() {
  }

  static <T extends Number> void divide() {
  }

}

