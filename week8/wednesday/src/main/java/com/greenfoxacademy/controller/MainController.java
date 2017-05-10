package com.greenfoxacademy.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String list(Model model) {
  return "index";
  }


}
