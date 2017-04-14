package arcraftapp;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  int initialAmmo, healthPoint;
  List<Aircraft> aircraftStorage;

  public Carrier(int initialAmmo) {
    this.initialAmmo = initialAmmo;
    healthPoint = 5000;
    aircraftStorage = new ArrayList<>();
  }

  void addAircraft(String givenAirCraft) {
    if (givenAirCraft.toUpperCase().equals("F16")) {
      F16 f16 = new F16();
      aircraftStorage.add(f16);
    } else if (givenAirCraft.toUpperCase().equals("F35")) {
      F35 f35 = new F35();
      aircraftStorage.add(f35);
    }
  }

  void fill() {

  }
}
