package com.khoinguyen.generic;

public class Calculation<T extends Number> {
  private T a;
  private T b;

  //T chưa biết là kiểu chi tiết là gì, ta biết 1 điều chắc chắn là kiểu só
  //Number là lớp chung
  //Integer/ Double là lớp con nó có nhiều tiên ích hơn
  //Lớp con mở rộng hơn cha, Number bình thường ko 5.6666

  public Calculation(T a, T b) {
    this.a = a;
    this.b = b;
  }

  public Calculation() {}

  public double add() {
    return a.doubleValue() + b.doubleValue(); //không mất dữ liệu
  }

  public double subtract() {
    return a.doubleValue() - b.doubleValue();
  }

  public double multiply() {
    return a.doubleValue() * b.doubleValue();
  }

  public double divide() {
    return a.doubleValue() / b.doubleValue();
  }
}

