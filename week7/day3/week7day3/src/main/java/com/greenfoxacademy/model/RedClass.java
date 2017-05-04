package com.greenfoxacademy.model;

import com.greenfoxacademy.service.MyColor;

public class RedClass implements MyColor {

  private String givenColor;

  @Override
  public void printColor() {
    this.givenColor = "Red";
  }

  public String getMessage() {
    System.out.println("This color is: " + givenColor);
    return givenColor;
  }

}
