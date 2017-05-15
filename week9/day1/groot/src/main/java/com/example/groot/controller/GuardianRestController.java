package com.example.groot.controller;

import com.example.groot.service.ErrorHandling;
import com.example.groot.model.Guardian;
import com.example.groot.service.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianRestController {

  @Autowired
  ErrorHandling errorHandling;

  @ExceptionHandler(value = MissingServletRequestParameterException.class)
  public ErrorHandling handleMissingRequestParam() {
    return new ErrorHandling("I am Groot!");
  }

  @RequestMapping(value = "/groot")
  public GuardianRepository grootMessage(@RequestParam(value = "message", required = true) String message) {
    if (message.length() == 0) {
      return new ErrorHandling("I am Groot!");
    }
    return new Guardian(message);
  }
}
