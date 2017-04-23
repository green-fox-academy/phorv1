package CreditCardReservation;

import Reservation.Reservationy;
import creditCard.CreditCardy;

public class CreditCardReservation implements Reservationy, CreditCardy {
  @Override
  public String getDowBooking() {
    return null;
  }

  @Override
  public String getCodeBooking() {
    return null;
  }

  @Override
  public int getSumCVV() {
    return 0;
  }

  @Override
  public String getNameCardholder() {
    return null;
  }

  @Override
  public String getCodeAccount() {
    return null;
  }

  @Override
  public int cumeSumCVV(long codeAccount) {
    return 0;
  }

}
