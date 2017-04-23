package Reservation;

import java.util.Arrays;
import java.util.List;

public interface Reservationy {
  List<String> DOW = Arrays
          .asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");
  List<String> NULL_TO_Z = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
  String TEXT = "Booking# %s for %s";


  String getDowBooking();

  String getCodeBooking();

  String toString(); //format("Booking# %s for %s");
}