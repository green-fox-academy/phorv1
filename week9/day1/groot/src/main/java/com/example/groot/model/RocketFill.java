package com.example.groot.model;

import com.example.groot.service.GuardianRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class RocketFill implements GuardianRepository {

  @Setter
  String received;
  @Setter
  int amount;
  String shipstatus;
  boolean ready;

  public void setShipstatus(float amount) {
    float maxAmmo = 12500;
    if (amount <= 0) {
      shipstatus = "empty";
    } else if (amount < maxAmmo && amount > 0) {
      float shipstatusNumber = (amount / maxAmmo) * 100;
      shipstatus = (int)shipstatusNumber + "%";
    } else if(amount == maxAmmo) {
      shipstatus = "full";
    } else {
      shipstatus = "overloaded";
    }
  }

  public void setReady() {
    ready = shipstatus.equals("full");
  }
}
