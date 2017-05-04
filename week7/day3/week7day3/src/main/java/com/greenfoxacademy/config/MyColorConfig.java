package com.greenfoxacademy.config;

import com.greenfoxacademy.model.RedClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {

  @Bean
  public RedClass redClass() {
    return new RedClass();
  }
}

