package com.greenfoxacademy.repo;

import com.greenfoxacademy.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long>{
}


