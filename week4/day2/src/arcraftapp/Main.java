package arcraftapp;

public class Main {

  public static void main(String[] args) {
    Carrier motherShip = new Carrier(5000);
    motherShip.addAircraft("F35");
    motherShip.addAircraft("F35");
    motherShip.addAircraft("F16");
    motherShip.addAircraft("F16");
    motherShip.addAircraft("F16");
    motherShip.fill();

    Carrier enemyShip = new Carrier(1000);
    enemyShip.addAircraft("F35");
    enemyShip.addAircraft("F35");
    enemyShip.addAircraft("F35");
    enemyShip.addAircraft("F16");
    enemyShip.addAircraft("F16");
    enemyShip.addAircraft("F16");
    enemyShip.addAircraft("F16");
    enemyShip.fill();

    while (motherShip.healthPoint >= 0 && enemyShip.healthPoint >= 0) {
      motherShip.fight(enemyShip);
      enemyShip.fight(motherShip);
      motherShip.fill();
      enemyShip.fill();
    }

    System.out.println(motherShip.getStatus());
    System.out.println(enemyShip.getStatus());
  }

}

