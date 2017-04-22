package Reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reservation implements Reservationy{

    private static final List<String> DOW = Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");
    private static final List<String> NULL_TO_Z = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

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
    String text = "Booking# %s for %s";
    return String.format(text, getCodeBooking(), getDowBooking());
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
