import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

  public static void main(String[] args) {
    List<Car> parkingLot = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      Car car = new Car(randomType(), randomColor());
      parkingLot.add(car);
    }
    sameType(parkingLot);
    sameColor(parkingLot);

  }

  public static CarType randomType() {
    int enumTypeLength = CarType.values().length;
    int randomType = (int) (Math.random() * enumTypeLength);

    return CarType.values()[randomType];
  }

  public static CarColor randomColor() {
    int enumColorLength = CarColor.values().length;
    int randomColor = (int) (Math.random() * enumColorLength);

    return CarColor.values()[randomColor];
  }

  public static <T extends Enum <T>> void sameType(List<Car> list) {
    Map<Enum<T>, Integer> typeStats = new HashMap();

    for (Car car : list) {
      if (typeStats.containsKey(car.type)) {
        int previousAmount = typeStats.get(car.type);
        typeStats.put((Enum<T>) car.type, ++previousAmount);
      } else {
        typeStats.put((Enum<T>) car.type, 1);
      }
    }
    printTypeStats(typeStats);
  }

  private static <T extends Enum <T>> void printTypeStats (Map<Enum<T>, Integer> stats) {
    for (Enum<T> genericEnumValue : stats.keySet()) {
      System.out.printf("%s: %d ", genericEnumValue, stats.get(genericEnumValue));
    }
    System.out.println();
  }

  public static void sameColor(List<Car> list) {
  Map<CarColor, Integer> colorStats = new HashMap<>();

    for (Car car : list) {
      if (colorStats.containsKey(car.color)) {
        int previousAmount = colorStats.get(car.color);

      }
    }


  }

}


