package com.example.entity;

import java.util.Set;

public class Vehicle {
  private Long id;
  private String vin;
  private String year;
  private String make;
  private String model;
  private String color;
  private String vehicleType;
  private Set<Long> bloobIds;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public Set<Long> getBloobIds() {
    return bloobIds;
  }

  public void setBloobIds(Set<Long> bloobIds) {
    this.bloobIds = bloobIds;
  }
}
