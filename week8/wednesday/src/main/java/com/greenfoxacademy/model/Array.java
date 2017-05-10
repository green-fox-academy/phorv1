package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Array {

  @Setter
  String what;
  @Setter
  List<Integer> numbers = new ArrayList<>();
  @Getter
  List<Integer> result = new ArrayList<>();

  public void sum() {
    if (what.equals("sum")) {
      int sum = 0;
      for (int i = 0; i < numbers.size(); i++) {
        sum += numbers.get(i);
      }
      result.add(sum);
    }
  }

  public void multiply() {
    if (what.equals("multiply")) {
      int multiply = 1;
      for (int i = 0; i < numbers.size(); i++) {
        multiply *= numbers.get(i);
      }
      result.add(multiply);
    }
  }

  public void doubleList() {
    if (what.equals("double")) {
      int toDouble = 2;
      for (int i = 0; i < numbers.size(); i++) {
        toDouble *= numbers.get(i);
        result.add(toDouble);
        toDouble = 2;
      }
    }
  }
}
