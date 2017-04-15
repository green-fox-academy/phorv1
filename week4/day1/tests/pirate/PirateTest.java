package pirate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PirateTest {

  @Test
  void drinkSomeRum() {

  }

  @Test
  void howItGoingMate_instantiation() {
    Pirate pirate = new Pirate();
    pirate.howItGoingMate();
    for (int i = 0; i < 5; i++) {
      pirate.drinkSomeRum();
    }
    pirate.howItGoingMate();
  }
}
