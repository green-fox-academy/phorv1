package Reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reservation implements Reservationy{
  
    @Override
  public String getDowBooking() {
    return randomGenerator(1, DOW);
  }

  @Override
  public String getCodeBooking() {
    return randomGenerator(8, NULL_TO_Z);
  }

  @Override
  public String toString() {
    return String.format(TEXT, getCodeBooking(), getDowBooking());
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
