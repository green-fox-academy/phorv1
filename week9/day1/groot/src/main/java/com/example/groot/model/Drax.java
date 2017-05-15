package com.example.groot.model;

import com.example.groot.service.GuardianRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Drax implements GuardianRepository{

  String name;
  int amount;
  int calorie;
}

