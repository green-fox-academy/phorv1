package com.greenfoxacademy.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fox {

  private String name;
  private List<Trick> listOfTricks;
  private Food food;
  private Drink drink;

}
