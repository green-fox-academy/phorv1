package CreditCardReservation;

import Reservation.Reservation;
import Reservation.Reservationy;
import creditCard.CreditCardy;
import java.util.List;

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

  @Override
  public String toString() {
    return super.toString();
  }

  String randomGenerator(int amountToRandomise, List<String> getRandomFrom) {
    String randomCode = "";
    for (int i = 0; i < amountToRandomise; i++) {
      int randomIndex = (int) (Math.random() * getRandomFrom.size());
      randomCode += getRandomFrom.get(randomIndex);
    }
    return randomCode;
  }

  static void createReservation(int amountOfRes) {
    for (int i = 0; i < amountOfRes; i++) {
      Reservation reservation = new Reservation();
      System.out.println(reservation);
    }
  }

}
