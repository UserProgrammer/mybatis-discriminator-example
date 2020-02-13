package com.example.entity;

import org.springframework.stereotype.Component;

public class Car extends Vehicle {
  private int doorCount;

  public int getDoorCount() {
    return doorCount;
  }

  public void setDoorCount(int doorCount) {
    this.doorCount = doorCount;
  }
}
