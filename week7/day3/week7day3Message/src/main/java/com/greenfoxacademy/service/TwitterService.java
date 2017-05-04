package com.greenfoxacademy.service;

public class TwitterService implements MessageService {

  @Override
  public void sendMessage(String message, String address) {
    System.out.println("Twitter Sent to: " + address + " " + message);
  }
}
