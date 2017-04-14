package arcraftapp;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  int ammoStorage, healthPoint;
  List<Aircraft> aircraftStorage;

  public Carrier(int ammoStorage) {
    this.ammoStorage = ammoStorage;
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
    if (ammoStorage == 0) {
      System.out.println("Should throw an OutOfAmmo exception!");
      System.exit(0);
    }
    for (Aircraft aircraftItem : aircraftStorage) {
      if (aircraftItem instanceof F35) {
        ammoStorage = aircraftItem.refill(ammoStorage);
      }
      if (ammoStorage == 0) {
        break;
      }
    }
    for (Aircraft aircraftItem : aircraftStorage) {
      if (aircraftItem instanceof F16) {
        ammoStorage = aircraftItem.refill(ammoStorage);
      }
    }
  }

  void fight(Carrier enemyAircraftCarrier) {
    int aircraftCarrierDamage = 0;
    for (Aircraft aircraftItem :aircraftStorage) {
      aircraftCarrierDamage += aircraftItem.baseDamage * aircraftItem.currentAmmo;
    }
    enemyAircraftCarrier.healthPoint -= aircraftCarrierDamage;
  }
}