package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Array implements RestMessageObject {

  @Setter
  String what;
  @Setter
  List<Integer> numbers = new ArrayList<>();
  @Getter
  int result;
  List<Integer> resultList = new ArrayList<>();


  public String whatGetter() {
    return what;
  }


  public void sum() {
    if (what.equals("sum")) {
      int sum = 0;
      for (int i = 0; i < numbers.size(); i++) {
        sum += numbers.get(i);
      }
      result = sum;
    }
  }

  public void multiply() {
    if (what.equals("multiply")) {
      int multiply = 1;
      for (int i = 0; i < numbers.size(); i++) {
        multiply *= numbers.get(i);
      }
      result = multiply;
    }
  }

  public ArrayReturn doubleList() {
    if (what.equals("double")) {
      int toDouble = 2;
      for (int i = 0; i < numbers.size(); i++) {
        toDouble *= numbers.get(i);
        resultList.add(toDouble);
        toDouble = 2;
      }
    }
      return new ArrayReturn(resultList);
  }
}
