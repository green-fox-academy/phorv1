package MarkerAnnotation;

import java.util.ArrayList;
import java.util.List;

public class ScreenMain {

  public static void main(String[] args) {
    List<Screen> listOfScreens = new ArrayList<>();
    listOfScreens.add(new Screen43(Size.INCH15));
    listOfScreens.add(new Screen43(Size.INCH17));
    listOfScreens.add(new Screen43(Size.INCH19));
    listOfScreens.add(new Screen169(Size.INCH21));
    listOfScreens.add(new Screen169(Size.INCH23));
    listOfScreens.add(new Screen169(Size.INCH25));
    listOfScreens.add(new Screen219(Size.INCH25));
    listOfScreens.add(new Screen219(Size.INCH29));
    listOfScreens.add(new Screen219(Size.INCH34));

    for (int i = 0; i < listOfScreens.size(); i++) {
    System.out.println(i + ": " + listOfScreens.get(i));
    }
  }
}
