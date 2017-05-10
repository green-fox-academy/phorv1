package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Appenda;
import com.greenfoxacademy.model.Array;
import com.greenfoxacademy.model.ArrayReturn;
import com.greenfoxacademy.model.Doubling;
import com.greenfoxacademy.model.Dountil;
import com.greenfoxacademy.model.ErrorMessage;
import com.greenfoxacademy.model.Greeter;
import com.greenfoxacademy.model.RestMessageObject;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingInput(MissingServletRequestParameterException e) {
    return "Error: missing input parameter: " + e.getMessage();
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorMessage handleHttpMessageNotReadable(HttpMessageNotReadableException e) {
    return new ErrorMessage("Please provide a number!");
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
    return new Appenda(appenda);
  }

  @PostMapping(value = "/dountil/{what}")
  public RestMessageObject dountil(@RequestBody Dountil dountil,
          @PathVariable(value = "what") String what) {
    if (dountil.notNegative()) {
      if (what.equals("sum")) {
        dountil.sum();
      } else if (what.equals("factor")) {
        dountil.factor();
      } else {
        return new ErrorMessage("Please enter 'sum' or 'factor'!");
      }
    } else {
      return new ErrorMessage("Please provide a number!");
    }
    return dountil;
  }

  @PostMapping(value = "/arrays")
  public RestMessageObject arrays(@RequestBody Array array) {
    if (array.whatGetter().equals("double")) {
      return array.doubleList();
    } else {
      array.sum();
      array.multiply();
    }
    return array;
  }
}

