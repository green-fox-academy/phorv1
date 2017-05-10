package com.greenfoxacademy.model;

import lombok.Getter;

@Getter
public class Greeter {

  String welcome_message;

  public Greeter(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }
}
