package com.greenfoxacademy.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubling {

  int received;
  int result;

  public Doubling(int received, int result) {
    this.received = received;
    this.result = result;
  }
}
