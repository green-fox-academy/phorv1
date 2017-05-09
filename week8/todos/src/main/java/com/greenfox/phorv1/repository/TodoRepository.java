package com.greenfox.phorv1.repository;

import com.greenfox.phorv1.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long>{

}
