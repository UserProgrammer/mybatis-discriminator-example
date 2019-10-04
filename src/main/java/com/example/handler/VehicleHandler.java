package com.example.handler;

import com.example.dao.IVehicleDao;
import com.example.entity.Vehicle;

import java.util.List;

public class VehicleHandler {
  private IVehicleDao vehicleDao;

  public List<Vehicle> getAllVehicles() {
    return vehicleDao.getAllVehicles();
  }

  public void setVehicleDao(IVehicleDao vehicleDao) {
    this.vehicleDao = vehicleDao;
  }
}
