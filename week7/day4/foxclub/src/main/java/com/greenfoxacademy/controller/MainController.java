package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping(value = "/")
  public ModelAndView infoPage(){
    ModelAndView m = new ModelAndView();
    m.setViewName("index");
    m.addObject(fox);
    return m;
  }

  @RequestMapping(value = "/nutritionstore")
  public ModelAndView nutritionStore(){
    ModelAndView m = new ModelAndView();
    m.setViewName("nutritionstore");
    return m;
  }

  @RequestMapping(value = "/trickcentre")
  public ModelAndView trickCentre(){
    ModelAndView m = new ModelAndView();
    m.setViewName("trickcentre");
    return m;
  }

}

