package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  String[] listOfTricks = {"Write HTML", "Code in Java", "Build Rocket", "Walk"};
  String[] buildRocket = {"Fly to Moon", "Fly to Mars", "Walk on Moon", "Walk on Mars"};

  @Autowired
  Fox fox;

  @RequestMapping(value = "/")
  public ModelAndView infoPage() {
    ModelAndView m = new ModelAndView();
    m.addObject(fox);
    m.addObject("knowsAllBasicTricks", knowsAllBasicTricks());
    m.setViewName("index");
    return m;
  }

  private boolean knowsAllBasicTricks() {
    List<String> listOfAllTricks = Arrays.asList(listOfTricks);
    List<String> listOfKnownTricks = new ArrayList<>();
    Collections.copy(fox.getListOfTricks(), listOfKnownTricks);
    boolean listAreSame;
    if (listOfAllTricks.size() != listOfKnownTricks.size()) {
      listAreSame = false;
    } else {
      Collections.sort(listOfAllTricks);
      Collections.sort(listOfKnownTricks);
      listAreSame = listOfAllTricks.equals(listOfKnownTricks);
    }
    return listAreSame;
  }

  @RequestMapping(value = "/nutritionstore")
  public ModelAndView nutritionStore() {
    ModelAndView m = new ModelAndView();
    m.setViewName("nutritionstore");
    return m;
  }

  @RequestMapping(value = "/trickcentre")
  public ModelAndView trickCentre() {
    ModelAndView m = new ModelAndView();
    List<String> remainingTricks = getRemainingBasicTricks(listOfTricks);
    if (remainingTricks.size() != 0) {
      m.addObject("listOfTricks", remainingTricks);
      m.setViewName("trickcentre");
    } else {
      List<String> additionalTricks = getRemainingAdvancedTricks(buildRocket);
      m.addObject("advancedTricks", additionalTricks);
      m.setViewName("advancedtricks");
    }
    return m;
  }

  private List<String> getRemainingBasicTricks(String[] listOfTricks) {
    List<String> returnList = new ArrayList<>();
    for (String trick : listOfTricks) {
      if (!fox.knowsTrick(trick)) {
        returnList.add(trick);
      }
    }
    return returnList;
  }

  private List<String> getRemainingAdvancedTricks(String[] listOfTricks) {
    List<String> returnList = new ArrayList<>();
    for (String trick : listOfTricks) {
      if (!fox.knowsAdvancedTrick(trick)) {
        returnList.add(trick);
      }
    }
    return returnList;
  }

  @RequestMapping(value = "/change-nutrition")
  public String addNutrition(@RequestParam String food, String drink) {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:";
  }

  @GetMapping(value = "/change-trick")
  public String addTrick(@RequestParam String addTrick) {
    fox.addTrick(addTrick);
    return "redirect:";
  }

  @GetMapping(value = "/change-advanced-trick")
  public String addAdvancedTrick(@RequestParam String addTrick) {
    fox.addAdvancedTrick(addTrick);
    return "redirect:";
  }
}

