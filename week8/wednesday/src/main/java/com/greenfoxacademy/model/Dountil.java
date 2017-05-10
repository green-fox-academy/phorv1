package com.greenfoxacademy.model;

import lombok.Getter;
import lombok.Setter;

public class Dountil implements RestMessageObject{

  @Setter
  private int until;
  @Getter
  private int result;

  public void sum(){
    int sum = 0;
    for (int i = 0; i <= until; i++) {
      sum += i;
    }
    result = sum;
  }

  public void factor(){
    int factor = 1;
    for (int i = 1; i <= until; i++) {
      factor *= i;
    }
    result = factor;
  }

  public boolean notNegative() {
    return until >= 0;
  }
}
