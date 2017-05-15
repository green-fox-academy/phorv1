package com.example.groot.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ErrorHandling implements GuardianRepository {

  String error;
}

