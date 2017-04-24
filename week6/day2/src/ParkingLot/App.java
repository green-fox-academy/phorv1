package ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

  public static void main(String[] args) {
    List<Car> parkingLot = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      Car car = new Car(randomType(), randomColor());
      parkingLot.add(car);
    }
    sameType(parkingLot);
    sameColor(parkingLot);
    mostFrequentCombo(parkingLot, CarColor.values(), CarType.values());
  }

  private static <T extends Enum<T>, S extends Enum<S>> void mostFrequentCombo(List<Car> carList,
          Enum<T>[] values0, Enum<S>[] values1) {
    Map<String, Integer> comboMap = new HashMap<>();

    for (Car car : carList) {
      String[] comboKeyElements = new String[2];
      String comboKey = "";

      for (Enum anEnum : car.getAllEnumFields()) {
        if (anEnum.getClass().equals(values0[0].getClass())) {
          comboKeyElements[0] = anEnum.name();
        } else if (anEnum.getClass().equals(values1[0].getClass())) {
          comboKeyElements[1] = anEnum.name();
        }
      }

      comboKey = comboKeyElements[0] + " " + comboKeyElements[1];

      if (comboMap.containsKey(comboKey)) {
        int previousValue = comboMap.get(comboKey);
        comboMap.put(comboKey, ++previousValue);
      } else {
        comboMap.put(comboKey, 1);
      }
    }
    printComboStats(comboMap);
  }

  private static void printComboStats(Map<String, Integer> comboMap) {
    String mostFrequentKey = "";
    int mostFrequentValue = 0;

    for (String comboKey : comboMap.keySet()) {
      if (comboMap.get(comboKey) > mostFrequentValue) {
        mostFrequentKey = comboKey;
        mostFrequentValue = comboMap.get(comboKey);
      }
    }
    System.out.printf("%s: %d%n", mostFrequentKey, comboMap.get(mostFrequentKey));
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


  public static <T extends Enum<T>> void sameType(List<Car> list) {
    Map<Enum<T>, Integer> stats = new HashMap<>();

    for (Car car : list) {
      if (stats.containsKey(car.type)) {
        int previousAmount = stats.get(car.type);
        stats.put((Enum<T>) car.type, ++previousAmount);
      } else {
        stats.put((Enum<T>) car.type, 1);
      }
    }
    printStats(stats);
  }

  private static <T extends Enum<T>> void printStats(Map<Enum<T>, Integer> stats) {
    for (Enum<T> genericEnumValue : stats.keySet()) {
      System.out.printf("%s: %d ", genericEnumValue, stats.get(genericEnumValue));
    }
    System.out.println();
  }

  public static <T extends Enum<T>> void sameColor(List<Car> list) {
    Map<Enum<T>, Integer> stats = new HashMap<>();

    for (Car car : list) {
      if (stats.containsKey(car.color)) {
        int previousAmount = stats.get(car.color);
        stats.put((Enum<T>) car.color, ++previousAmount);
      } else {
        stats.put((Enum<T>) car.color, 1);
      }
    }
    printStats(stats);
  }


}



