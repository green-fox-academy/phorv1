package pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew;
  Captain captain;

  Ship() {
    crew = new ArrayList<>();
  }

  void fillShip() {
    int numberOfPirates = 50 + (int) (Math.random() * 51);
    for (int i = 1; i <= numberOfPirates; i++) {
      crew.add(new Pirate(i));
    }
  }
}


