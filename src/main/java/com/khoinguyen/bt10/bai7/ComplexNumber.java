package com.khoinguyen.bt10.bai7;

public class ComplexNumber {
  double a;
  double b;

  public ComplexNumber(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public ComplexNumber() {}

  public ComplexNumber add(ComplexNumber other){
    double am = this.a + other.a;
    double bm = this.b + other.b;
    return new ComplexNumber(am, bm);
  }

  public ComplexNumber sub(ComplexNumber other){
    double am = this.a - other.a;
    double bm = this.b - other.b;
    return new ComplexNumber(am, bm);
  }

  public ComplexNumber mul(ComplexNumber other){
    double am = this.a * other.a - this.b * other.b;
    double bm = this.a * other.b + other.a * this.b;
    return new ComplexNumber(am, bm);
  }

  public void print() {
    System.out.printf("%s + %si", a, b);
  }
}
