package com.example.dao;

import com.example.entity.CarOwnership;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ICarDaoTest {
  @Autowired
  private ICarDao carDao;

  @Test
  public void test_getCarOwnership() throws JsonProcessingException {
    List<CarOwnership> carOwnerships = carDao.getCarOwnership();

    ObjectMapper om = new ObjectMapper();
    String actualJsonValue = om.writeValueAsString(carOwnerships);
    String expectedJsonValue = "[{\"car\":{\"id\":1,\"vin\":\"13icf043\",\"year\":\"2019\",\"make\":\"Subaru\",\"model\":\"Legacy\",\"color\":\"black\",\"vehicleType\":\"car\",\"serviceRecordIds\":[1,2,3],\"doorCount\":4},\"user\":{\"id\":1,\"firstName\":\"Michael\",\"lastName\":\"da Costa\"}},{\"car\":{\"id\":2,\"vin\":\"4tgu4985\",\"year\":\"2014\",\"make\":\"Ford\",\"model\":\"Escape\",\"color\":\"red\",\"vehicleType\":\"car\",\"serviceRecordIds\":[],\"doorCount\":5},\"user\":{\"id\":2,\"firstName\":\"John\",\"lastName\":\"Doe\"}}]";

    assertEquals(expectedJsonValue, actualJsonValue);
  }
}
