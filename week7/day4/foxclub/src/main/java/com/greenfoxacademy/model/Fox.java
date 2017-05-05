package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fox {

  private String name;
  private ArrayList<String> listOfTricks;
  private ArrayList<String> advancedTricks;
  private String food;
  private String drink;

  public Fox() {
    this.name = "Megan";
    listOfTricks = new ArrayList<>();
    advancedTricks = new ArrayList<>();
    this.food = "nothing";
    this.drink = "nothing";
  }

  public void addTrick(String trick) {
    listOfTricks.add(trick);
  }

  public void addAdvancedTrick(String trick) {
    advancedTricks.add(trick);
  }

  public int knownTricks() {
    return listOfTricks.size();
  }

  public boolean knowsTrick(String trick) {
    for (String trickElement : listOfTricks) {
      if (trickElement.equals(trick)) {
        return true;
      }
    }
    return false;
  }

  public boolean knowsAdvancedTrick(String trick) {
    for (String trickElement : advancedTricks) {
      if (trickElement.equals(trick)) {
        return true;
      }
    }
    return false;
  }
}
