package com.example.groot.controller;

import com.example.groot.model.Rocket;
import com.example.groot.model.RocketFill;
import com.example.groot.model.Yondu;
import com.example.groot.service.ErrorHandling;
import com.example.groot.model.Groot;
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
  @Autowired
  Yondu yondu;
  @Autowired
  Rocket rocket;
  @Autowired
  RocketFill rocketFill;

  @ExceptionHandler(value = MissingServletRequestParameterException.class)
  public ErrorHandling handleMissingRequestParam() {
    return new ErrorHandling("I am Groot!");
  }

  @RequestMapping(value = "/groot")
  public GuardianRepository grootMessage(
          @RequestParam(value = "message", required = true) String message) {
    if (message.length() == 0) {
      return new ErrorHandling("I am Groot!");
    }
    return new Groot(message);
  }

  @RequestMapping(value = "/yondu")
  public GuardianRepository calculateSpeed(@RequestParam(value = "distance") Double distance,
          @RequestParam(value = "time") Double time) {
    if (distance == null || time == null) {
      return new ErrorHandling("Distance or Time cannot be null!");
    }
    yondu.setDistance(distance);
    yondu.setTime(time);
    yondu.setSpeed();
    return yondu;
  }

  @RequestMapping(value = "/rocket")
  public GuardianRepository actualCargo() {
    return rocket;
  }

  @RequestMapping(value = "/rocket/fill")
  public GuardianRepository fillCargo(@RequestParam(value = "caliber") String caliber,
          @RequestParam(value = "amount") Integer amount) {
    if (caliber == null || amount == null) {
      return new ErrorHandling("Caliber or Amount cannot be null!");
    }
    rocket.fillAmount(caliber, amount);
    rocket.setCargoStatus();
    rocket.setReady();
    rocketFill.setReceived(caliber);
    rocketFill.setAmount(amount);
    rocketFill.setShipstatus(amount);
    rocketFill.setReady();
    return rocketFill;
  }
}
