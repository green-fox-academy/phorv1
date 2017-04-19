package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {

  public static final List<String> COLORS = new ArrayList<>(
          Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));
  public static final List<String> VALUES = new ArrayList<>(
          Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
                  "Ace"));
  private String color, value;

  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return color + " " + value;
  }
}
