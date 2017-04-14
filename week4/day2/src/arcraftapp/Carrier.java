package arcraftapp;

import java.util.List;

public class Carrier {
  int initialAmmo, healthPoint;
  List<Aircraft> storeAircrafts;

  public Carrier(int initialAmmo) {
    healthPoint = 5000;
    this.initialAmmo = initialAmmo;
  }
  void add_aircraft(String givenAirCraft) {
   if (givenAirCraft.toUpperCase().equals("F16")) {
     F16 f16 = new F16();
   } else if (givenAirCraft.toUpperCase().equals("F35")) {
     F35 f35 = new F35();
    }
  }
}
