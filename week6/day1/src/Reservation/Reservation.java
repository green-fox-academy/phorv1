package Reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reservation implements Reservationy{

    private static final List<String> DOW = Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");
    private static final List<String> NULL_TO_Z = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    @Override
  public String getDowBooking() {
    return null;
  }

  @Override
  public String getCodeBooking() {

    return null;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  String randomGenerator(int amountToRandomise, List<String> getRandomFrom) {
    String randomCode = null;
    for (int i = 0; i < amountToRandomise; i++) {
      int randomIndex = (int) (Math.random() * getRandomFrom.size());
      randomCode += getRandomFrom.get(randomIndex);
    }
    return randomCode;
  }

}
