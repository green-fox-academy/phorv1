package com.greenfoxacademy.model;

import lombok.Getter;

@Getter
public class ErrorMessage implements RestMessageObject {

  String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public ErrorMessage() {
    this.error = error;
  }

}
