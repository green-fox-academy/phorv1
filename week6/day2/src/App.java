import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {
    List<Car> parkingLot = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      Car car = new Car(randomType(), randomColor());
      parkingLot.add(car);
    }
    System.out.println(parkingLot);
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

}


