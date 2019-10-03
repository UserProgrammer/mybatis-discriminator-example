package com.example.controller;

import com.example.handler.UserHandler;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.example.entity.User;

import java.util.List;

@RestController
@RequestMapping("example")
public class UserController{
  private static final Logger logger = LogManager.getLogger(UserController.class);
  private UserHandler userHandler;

  @GetMapping("/users")
  public HttpEntity<List> getUsers(){
    logger.info("Retrieving all users.");

    return new ResponseEntity<>(userHandler.getUsers(), HttpStatus.OK);
  }

  @GetMapping("/users/{id}")
  public HttpEntity<User> getUserById(@PathVariable("id") Long userId){
    logger.info("Retrieving user with ID = " + userId);

    return new ResponseEntity<>(userHandler.getUserById(userId), HttpStatus.OK);
  }

  public void setUserHandler(UserHandler userHandler) {
    this.userHandler = userHandler;
  }
}
