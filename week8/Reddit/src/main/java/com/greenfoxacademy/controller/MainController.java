package com.greenfoxacademy.controller;

import com.greenfoxacademy.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  @Autowired
  PostRepository postRepository;

}
