package com.greenfox.phorv1.repo;

import com.greenfox.phorv1.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long>{
  List<Todo> findAllByIsDoneTrue();
  List<Todo> findAllByIsDoneFalse();
}
