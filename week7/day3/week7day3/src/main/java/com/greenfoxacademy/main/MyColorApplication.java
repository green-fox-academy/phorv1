package com.greenfoxacademy.main;

import com.greenfoxacademy.config.MyColorConfig;
import com.greenfoxacademy.model.RedClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyColorApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloWolrdApplication.class, args);
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            MyColorConfig.class);

    RedClass redClass = context.getBean(RedClass.class);
    redClass.printColor();
    redClass.getMessage();
  }

}
