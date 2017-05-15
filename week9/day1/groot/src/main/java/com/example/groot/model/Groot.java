package com.example.groot.model;

import com.example.groot.service.GuardianRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Groot implements GuardianRepository {

  String received;
  String translated;

  public Groot(String received) {
    this.received = received;
    translated = "I am Groot!";
  }
}

