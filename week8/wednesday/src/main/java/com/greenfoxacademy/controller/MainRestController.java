package com.greenfoxacademy.controller;

import com.greenfoxacademy.controller.model.Appenda;
import com.greenfoxacademy.controller.model.Doubling;
import com.greenfoxacademy.controller.model.Greeter;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingInput(MissingServletRequestParameterException e) {
    return "Error: missing input parameter: " + e.getMessage();
  }

  @GetMapping(value = "/doubling")
  public Doubling doubling(@RequestParam(value = "input") int input) {
    Doubling doubling = new Doubling(input, input * 2);
    return doubling;
  }

  @GetMapping(value = "/greeter")
  public Greeter greeter(@RequestParam(value = "name") String name,
          @RequestParam(value = "title") String title) {
    return new Greeter(name, title);
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Appenda appenda(@PathVariable(value = "appendable") String appenda) {
    return  new Appenda(appenda);
  }

}
