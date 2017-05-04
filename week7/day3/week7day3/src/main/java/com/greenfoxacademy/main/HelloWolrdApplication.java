package com.greenfoxacademy.main;

import com.greenfoxacademy.config.HelloWorldConfig;
import com.greenfoxacademy.model.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWolrdApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloWolrdApplication.class, args);
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            HelloWorldConfig.class);

    HelloWorld helloWorld = context.getBean(HelloWorld.class);
    helloWorld.setMessage("Hello World");
    helloWorld.getMessage();
  }
}

