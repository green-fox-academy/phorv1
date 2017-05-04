package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fox {

  private String name;
  private List<String> listOfTricks;
  private String food;
  private String drink;

  public Fox() {
    this.name = "Vukk";
    this.listOfTricks = new ArrayList<>();
    this.food = "nothing";
    this.drink = "nothing";
  }

  public void addTrick(String trick) {
    listOfTricks.add(trick);
  }
}
