package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ArrayReturn implements RestMessageObject {

  @Getter
  List<Integer> result;
}
