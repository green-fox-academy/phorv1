package com.greenfoxacademy.model;

import lombok.Getter;

@Getter
public class Appenda {

  String appended;

  public Appenda(String input) {
    this.appended = input + "a";
  }
}
