package com.greenfox.phorv1.controller;

import com.greenfox.phorv1.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository repository;

  @RequestMapping(value = {"", "list"})
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
  return "/todolist";
  }

}
