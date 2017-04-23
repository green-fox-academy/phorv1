package CreditCardReservation;

import Reservation.Reservation;
import Reservation.Reservationy;
import creditCard.CreditCardy;
import java.util.List;

public class CreditCardReservation implements Reservationy, CreditCardy {

  private int sum, ordinalNumber;
  long codeAccount;
  private String name;
  private static int counter = 0;
  static final String CARD_RES_FORMAT = TEXT + " paid by " + FORMAT;

  public CreditCardReservation() {
    this.ordinalNumber = counter++;
    codeAccount = randomGeneratorCC(16);
    this.name = "DEF" + ordinalNumber ;
    this.sum = cumeSumCVV(codeAccount);
  }


  @Override
  public String getDowBooking() {
    return randomGeneratorBooking(1, DOW);
  }

  @Override
  public String getCodeBooking() {
    return randomGeneratorBooking(8, NULL_TO_Z);
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

  String randomGeneratorBooking(int amountToRandomise, List<String> getRandomFrom) {
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

  long randomGeneratorCC(int amountToRandomise) {
    String randomCode = "";
    for (int i = 0; i < amountToRandomise; i++) {
      if (i == 0) {
        int randomNumber = 1 + (int) (Math.random() * 9);
        randomCode += String.valueOf(randomNumber);
      } else {
        int randomNumber = (int) (Math.random() * 10);
        randomCode += String.valueOf(randomNumber);
      }
    }
    return Long.parseLong(randomCode);
  }


}
