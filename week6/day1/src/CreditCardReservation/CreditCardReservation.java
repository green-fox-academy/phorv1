package CreditCardReservation;

import Reservation.Reservation;
import Reservation.Reservationy;
import creditCard.CreditCard;
import creditCard.CreditCardy;

public class CreditCardReservation implements Reservationy, CreditCardy {

  private int sum, ordinalNumber;
  long codeAccount;
  private String name;
  private static int counter = 0;
  static final String CARD_RES_FORMAT = TEXT + " paid by " + FORMAT;
  CreditCard card = new CreditCard();
  Reservation res = new Reservation();

  public CreditCardReservation() {
    this.ordinalNumber = counter++;
    codeAccount = card.randomGenerator(16);
    this.name = "DEF" + ordinalNumber ;
    this.sum = cumeSumCVV(codeAccount);
  }

  @Override
  public String getDowBooking() {
    return res.randomGenerator(1, DOW);
  }

  @Override
  public String getCodeBooking() {
    return res.randomGenerator(8, NULL_TO_Z);
  }

  @Override
  public int getSumCVV() {
    return sum;
  }

  @Override
  public String getNameCardholder() {
    return name;
  }

  @Override
  public String getCodeAccount() {
    return String.valueOf(codeAccount);
  }

  @Override
  public int cumeSumCVV(long codeAccount) {
    String[] codeAccountElements = String.valueOf(codeAccount).split("");
    int sum = 0;
    for (int i = 0; i < codeAccountElements.length; i++) {
      sum += Integer.parseInt(codeAccountElements[i]);
    }
    return sum;
  }

  @Override
  public String toString() {
    return String.format(CARD_RES_FORMAT, getCodeBooking(), getDowBooking(), getNameCardholder(), getCodeAccount(), getSumCVV());
  }

}
