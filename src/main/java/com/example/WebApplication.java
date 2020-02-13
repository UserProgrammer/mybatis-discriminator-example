package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@SpringBootApplication
public class WebApplication{
  private static final Logger logger = LogManager.getLogger(WebApplication.class);

  public static void main(String[] args){
    SpringApplication.run(WebApplication.class, args);
  }
}
