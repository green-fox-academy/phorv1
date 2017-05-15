package com.example.groot.model;

import com.example.groot.service.ErrorHandling;
import com.example.groot.service.GuardianRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Rocket implements GuardianRepository {

  int caliber25;
  int caliber30;
  int caliber50;
  String shipstatus = "empty";
  boolean ready;

  public void fillAmount(String received, int amount) {
    if (received.equals(".25")) {
      caliber25 += amount;
    } else if (received.equals(".30")) {
      caliber30 += amount;
    } else if (received.equals(".50")) {
      caliber50 += amount;
    } else {
      new ErrorHandling("Error");
    }
  }

  public void setCargoStatus() {
    int fullAmmoAmount = caliber25 + caliber30 + caliber50;
    float maxAmmo = 12500;
    if (fullAmmoAmount <= 0) {
      shipstatus = "empty";
    } else if (fullAmmoAmount < maxAmmo && fullAmmoAmount > 0) {
      float shipstatusNumber = (fullAmmoAmount / maxAmmo) * 100;
      shipstatus = (int) shipstatusNumber + "%";
    } else if (fullAmmoAmount == maxAmmo) {
      shipstatus = "full";
    } else {
      shipstatus = "overloaded";
    }
  }

  public void setReady() {
    if (shipstatus.equals("full")) {
      ready = true;
    } else {
      ready = false;
    }
  }
}

