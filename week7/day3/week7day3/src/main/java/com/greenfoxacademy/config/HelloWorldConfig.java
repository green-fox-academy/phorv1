package com.greenfoxacademy.config;

import com.greenfoxacademy.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

  @Bean
  public HelloWorld helloWorld() {
    return new HelloWorld();
  }
}
