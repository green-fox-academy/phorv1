package com.greenfoxacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @RequestMapping(value = "/")
  public ModelAndView infoPage(){
    ModelAndView m = new ModelAndView();
    m.setViewName("index");
    return m;
  }
}
