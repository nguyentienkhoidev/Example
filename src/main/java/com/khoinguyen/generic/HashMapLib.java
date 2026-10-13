package com.khoinguyen.generic;

public class HashMapLib<K extends Number, V extends Number> {
  private K a;
  private V b;

  public HashMapLib (K a, V b) {
    this.a = a;
    this.b = b;
  }

  public double add() {
    return a.doubleValue() + b.doubleValue();
  }
}
