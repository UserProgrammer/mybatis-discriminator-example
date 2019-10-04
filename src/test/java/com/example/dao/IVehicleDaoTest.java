package com.example.dao;

import com.example.entity.Vehicle;
import com.example.handler.VehicleHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class IVehicleDaoTest {
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
