package com.khoinguyen.oopp.bt2;

public class Plus {
    private int a;
    private int b;
    private int c;

    //da hinh : overloading vs overriding
    //overloading: cùng tên nhưng khác số lượng tham số hoặc kiểu dữ liệu

  public int add(int a, int b) {
    return a + b;
  }

  public double add(double a, int b) {
    return a + b;
  }

  public double add(int a, double b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public double add(double a, int b, int c) {
    return a + b + c;
  }

  public double add(int a, double b, int c) {
    return a + b + c;
  }

  public double add(int a, double b, double c) {
    return a + b + c;
  }

  public Plus(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Plus() {
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }
}
