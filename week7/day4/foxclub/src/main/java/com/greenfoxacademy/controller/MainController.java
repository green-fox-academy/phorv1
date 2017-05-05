package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    String[] listOfTricks = {"Write HTML", "Code in Java", "Jump", "Swim", "Teleport", "Teach", "Fly", "Kill", "Read Mind"};

  @Autowired
  Fox fox;

  @RequestMapping(value = "/")
  public ModelAndView infoPage(){
    ModelAndView m = new ModelAndView();
    m.addObject(fox);
    m.setViewName("index");
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
    List<String> remainingTricks = getRemainingTricks(listOfTricks);
    m.addObject("listOfTricks", remainingTricks);
    m.setViewName("trickcentre");
    return m;
  }

  private List<String> getRemainingTricks(String[] listOfTricks) {
    List<String> returnList = new ArrayList<>();
    for (String trick : listOfTricks ){
      if(!fox.knowsTrick(trick)) {
        returnList.add(trick);
      }
    }
    return returnList;
  }

  @RequestMapping(value = "/change-nutrition")
  public String addNutrition(@RequestParam String food, String drink){
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:";
  }

  @GetMapping(value = "/change-trick")
  public String addTrick(@RequestParam String addTrick){
    fox.addTrick(addTrick);
    return "redirect:";
  }



}

