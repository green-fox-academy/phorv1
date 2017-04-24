package Calculator;

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
    Double difference = null;
    try {
      difference = numbers[0].doubleValue();
      int i = 1;
      if (i < numbers.length) {
        T elements = numbers[i];
        difference -= elements.doubleValue();
        i++;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Not enough value is provided! Give me at least two values!");
    }
    return (T) difference;
  }

  static <T extends Number> T multiply(T... numbers) {
    Double product = null;
    try {
      product = numbers[0].doubleValue();
      int i = 1;
      if (i < numbers.length) {
        T elements = numbers[i];
        product *= elements.doubleValue();
        i++;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Not enough value is provided! Give me at least two values!");
    }
    return (T) product;
  }

  static <T extends Number> T divide(T... numbers) {
    Double quotient = null;
    try {

      quotient = numbers[0].doubleValue();
      int i = 1;
      while (i < numbers.length) {
        T elements = numbers[i];
        quotient /= elements.doubleValue();
        i++;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Not enough value is provided! Give me at least two values!");
    }
    return (T) quotient;
  }

}

