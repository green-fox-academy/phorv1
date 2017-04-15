package pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  List<Pirate> crew;
  Captain captain;
  int shipID;
  static int totalShipID = 1;

  Ship() {
    crew = new ArrayList<>();
    this.shipID = totalShipID;
    totalShipID++;
  }

  void fillShip() {
    captain = new Captain();
    int numberOfPirates = 50 + (int) (Math.random() * 51);
    for (int i = 1; i <= numberOfPirates; i++) {
      Pirate pirate = new Pirate();
      pirate.setIdNumber(i);
      crew.add(pirate);
    }
  }

  int alivePirates() {
    int alivePiratesNumber = 0;
    for (Pirate pirate : crew) {
      if (pirate.isAlive) {
        alivePiratesNumber++;
      }
    }
    return alivePiratesNumber;
  }

  void printStatus() {
    String captainRumsDrunk = " | Captain's consumed rum: ";
    String captainAlive = "Captain is still alive!";
    String captainDead = "Captain has died!";
    String passOut = " Passed Out!";
    String isNoTPassOut = "Captain can still drink and fight!";
    String alivePiratesString = " | Number of alive pirates on board: ";

    String isAlive = captain.isAlive ? captainAlive : captainDead;
    String isPassOut = captain.isPassOut ? passOut : isNoTPassOut;

    String shipInfo = "Ship ID: " + shipID + captainRumsDrunk + captain.rumsDrank + " | State: "
            + isAlive + "/" + isPassOut + alivePiratesString + alivePirates();
    System.out.println(shipInfo);
  }
}


