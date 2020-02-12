package com.example.dao;

import com.example.BaseTest;
import com.example.entity.CarOwnership;
import com.example.handler.CarHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarHandlerTest extends BaseTest {
  @Autowired
  private CarHandler carHandler;

  @Test
  public void test_getCarOwnership() {
    List<CarOwnership> carOwnerships = carHandler.getCarOwnership();

    ObjectMapper om = new ObjectMapper();
    try {
      System.out.println(om.writeValueAsString(carOwnerships));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
  }
}
