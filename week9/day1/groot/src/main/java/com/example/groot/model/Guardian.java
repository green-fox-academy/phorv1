package com.example.groot.model;

import com.example.groot.service.GuardianRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Guardian implements GuardianRepository {

  String received;
  String translated;

  public Guardian(String received) {
    this.received = received;
    translated = "I am Groot!";
  }
}

