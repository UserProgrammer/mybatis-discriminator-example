package com.example.entity;

public class Truck extends Vehicle {
  private int boxSize;
  private boolean extendedCab;

  public int getBoxSize() {
    return boxSize;
  }

  public void setBoxSize(int boxSize) {
    this.boxSize = boxSize;
  }

  public boolean isExtendedCab() {
    return extendedCab;
  }

  public void setExtendedCab(boolean extendedCab) {
    this.extendedCab = extendedCab;
  }
}
