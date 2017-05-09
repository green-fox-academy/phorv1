package com.greenfox.phorv1.controller;

import com.greenfox.phorv1.model.Todo;
import com.greenfox.phorv1.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository repository;

  @RequestMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive,
          Model model) {
    if (isActive) {
      model.addAttribute("todos", repository.findAllByIsDoneFalse());
    } else {
      model.addAttribute("todos", repository.findAll());
    }
    return "/todolist";
  }

  @GetMapping(value = "/add")
  public String addTodo(Model model) {
    model.addAttribute("todos", new Todo());
    return "addtodo";
  }

  @PostMapping (value = "/add")
  public String saveTodo(Todo todo) {
    repository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/delete")
  public String removeTodo(@PathVariable("id") long id) {
    repository.delete(id);
    return "redirect:/todo/";
  }

}
