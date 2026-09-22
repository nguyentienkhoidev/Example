package com.khoinguyen.abstract_p;

public class HinhTron extends Hinh {
  private double r;

  public HinhTron(double r) {
    this.r = r;
  }

  public HinhTron() {}

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }

  @Override
  public double chuVi() {
    return 2 * Math.PI * r;
  }

  @Override
  public double dienTich() {
    return Math.PI * r * r;
  }

  @Override
  public void getName() {
    System.out.println("Hinh Tron");
  }
}
