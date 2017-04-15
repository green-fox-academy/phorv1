package pirate;

class Pirate {
  int rumsDrank;

  void drinkSomeRum() {
    rumsDrank++;
  }

  void howItGoingMate() {
  String answer;
  String askMoreRum = "Pour me anudder!";
  String tooDrunk = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";

  answer = (rumsDrank < 5) ? askMoreRum : tooDrunk;
    System.out.println(answer);
  }

}

