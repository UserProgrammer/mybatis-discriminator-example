package com.example.dao;

import com.example.BaseTest;
import com.example.entity.Vehicle;
import com.example.handler.VehicleHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IVehicleDaoTest extends BaseTest {
  @Autowired
  private VehicleHandler vehicleHandler;

  @Test
  public void test_getAllVehicles() {
    List<Vehicle> allVehicles = vehicleHandler.getAllVehicles();

    ObjectMapper objectMapper = new ObjectMapper();
    try {
      System.out.println(objectMapper.writeValueAsString(allVehicles));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
  }
}
