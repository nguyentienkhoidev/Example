package com.khoinguyen.abstract_p;

public class TamGiac extends Hinh{
  private double canhA;
  private double canhB;
  private double canhC;

  public TamGiac(double canhA, double canhB, double canhC) {
    this.canhA = canhA;
    this.canhB = canhB;
    this.canhC = canhC;
  }

  public TamGiac() {
  }

  public double getCanhA() {
    return canhA;
  }

  public void setCanhA(double canhA) {
    this.canhA = canhA;
  }

  public double getCanhB() {
    return canhB;
  }

  public void setCanhB(double canhB) {
    this.canhB = canhB;
  }

  public double getCanhC() {
    return canhC;
  }

  public void setCanhC(double canhC) {
    this.canhC = canhC;
  }

  @Override
  public double chuVi() {
    return canhA + canhB + canhC;
  }

  @Override
  public double dienTich() {
    double p = (canhA + canhB + canhC) / 2;
    return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
  }

  @Override
  public void getName() {
    System.out.println("Hinh Tam Giac");
  }
}
