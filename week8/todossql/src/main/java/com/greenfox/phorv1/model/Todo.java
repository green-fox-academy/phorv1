package com.greenfox.phorv1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String title;
  boolean isUrgent = false;
  boolean isDone = false;

}
