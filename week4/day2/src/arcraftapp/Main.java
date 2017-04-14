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
    System.out.println(motherShip.getStatus());
  }

}

