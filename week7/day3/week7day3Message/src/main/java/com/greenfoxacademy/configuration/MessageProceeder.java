package com.greenfoxacademy.configuration;

import com.greenfoxacademy.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

  @Autowired
  MessageService service;

  public void processMessage(String message, String address) {
  service.sendMessage(message, address);
  }
}

