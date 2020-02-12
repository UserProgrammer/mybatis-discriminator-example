package com.example.handler;

import com.example.dao.ICarDao;
import com.example.entity.CarOwnership;

import java.util.List;

public class CarHandler {
  private ICarDao carDao;

  public List<CarOwnership> getCarOwnership() {
    return carDao.getCarOwnership();
  }

  public void setCarDao(ICarDao carDao) {
    this.carDao = carDao;
  }
}
