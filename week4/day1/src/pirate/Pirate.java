package pirate;

class Pirate {

  int rumsDrank;
  private int idNumber;
  boolean isAlive, isPassOut;
  String deadMessage;
  String anotherDeadMessage;

  public int getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  Pirate() {
    rumsDrank = 0;
    isAlive = true;
    isPassOut = false;
    deadMessage = "He is dead!";
    anotherDeadMessage = "Another pirate is dead";
  }

  void drinkSomeRum() {
    if (isAlive) {
      rumsDrank++;
    } else {
      System.out.println(deadMessage);
    }
  }

  void howItGoingMate() {
    String askMoreRum = "Pour me anudder!";
    String tooDrunk = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";

    if (isAlive) {
      String answer = (rumsDrank < 5) ? askMoreRum : tooDrunk;
      System.out.println(answer);
    } else {
      System.out.println(deadMessage);
    }
  }

  void die() {
    isAlive = false;
  }

  void passOut() {
    isPassOut = true;
  }

  void brawl(Pirate anotherPirate) {
    if (!isAlive) {
      System.out.println(deadMessage);
    } else if (!anotherPirate.isAlive) {
      System.out.println(anotherDeadMessage);
    } else {
      // outcome: what happens:
      // 1 - Pirate dies
      // 2 - another Pirate dies
      // 3 - both pass out
      int outcome = 1 + (int) (Math.random() * 3);
      if (outcome == 1) {
        die();
      } else if (outcome == 2) {
        anotherPirate.die();
      } else {
        passOut();
        anotherPirate.passOut();
      }
    }
  }

}

