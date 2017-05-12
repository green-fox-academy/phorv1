package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Post;
import com.greenfoxacademy.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Timestamp;


@RestController
public class RedditRestController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/posts")
  public Iterable<Post> postsFunction() {
    return postRepository.findAll();
  }


  @PostMapping(value = "/posts")
  public Post addPost(@RequestBody Post post) {
    post.setTimestamp(new Timestamp(System.currentTimeMillis()));
    return postRepository.save(post);
  }
  @PostMapping(value = "/posts/{id}/upvote")
  public Post upVote(@PathVariable (value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.upVote();
    postRepository.save(post);
    return post;
  }

  @PostMapping(value = "/posts/{id}/downvote")
  public Post downVote(@PathVariable (value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.downVote();
    postRepository.save(post);
    return post;
  }
}

