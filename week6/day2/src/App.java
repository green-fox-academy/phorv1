import java.util.ArrayList;
import java.util.List;

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

  public static carType randomType() {
    int randomType = (int) (Math.random() * 4);
    carType type;

    if (randomType == 0) {
      type = carType.BMW;
    } else if (randomType == 1) {
      type = carType.AUDI;
    } else if (randomType == 2) {
      type = carType.MERCEDES;
    } else {
      type = carType.VOLKSWAGEN;
    }
    return type;
  }

  public static carColor randomColor() {
    int randomColor = (int) (Math.random() * 4);
    carColor color;

    if (randomColor == 0) {
      color = carColor.RED;
    } else if (randomColor == 1) {
      color = carColor.BLACK;
    } else if (randomColor == 2) {
      color = carColor.SILVER;
    } else {
      color = carColor.WHITE;
    }
    return color;
  }

  public static void sameType(List<Car> list) {
    int countBMW = 0;
    int countAudi = 0;
    int countMercedes = 0;
    int countVolkswagen = 0;

    for (Car car : list) {
      if (car.type == carType.BMW) {
        countBMW++;
      } else if (car.type == carType.AUDI) {
        countAudi++;
      } else if (car.type == carType.MERCEDES) {
        countMercedes++;
      } else {
        countVolkswagen++;
      }
    }
    System.out.println("BMW: " + countBMW + " Audi: " + countAudi + " Mercedes: " + countMercedes
            + " Volkswagen: " + countVolkswagen);
  }

  public static void sameColor(List<Car> list) {
    int countRed = 0;
    int countBlack = 0;
    int countSilver = 0;
    int countWhite = 0;

    for (Car car : list) {
      if (car.color == carColor.RED) {
        countRed++;
      } else if (car.color == carColor.BLACK) {
        countBlack++;
      } else if (car.color == carColor.SILVER) {
        countSilver++;
      } else {
        countWhite++;
      }
    }
    System.out.println(
            "Red: " + countRed + " Black: " + countBlack + " Silver: " + countSilver + " White: "
                    + countWhite);
  }
}


