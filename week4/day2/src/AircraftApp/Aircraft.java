package AircraftApp;

public class Aircraft {

  int baseAmmo = 0;
  int maxAmmo;
  int baseDamage;
  String type;

  public int fight() {
    int damage = maxAmmo * baseDamage;
    return damage;
  }
  public int refill(int refillParameter) {
    int remainingAmmo = refillParameter - maxAmmo + baseAmmo;
    this.baseAmmo = maxAmmo;
    return remainingAmmo;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type: " + this.type + ", Ammo: " + baseAmmo + ", Base damage: " + baseDamage + ", All damage: "
            + (baseAmmo * baseDamage);
  }
}
