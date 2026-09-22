package com.khoinguyen.interfaces;

public class HinhTron implements IHinh {
  private int r;

  public HinhTron(int r) {
    this.r = r;
  }

  public HinhTron() {
  }

  public int getR() {
    return r;
  }
  public void setR(int r) {
    this.r = r;
  }

  @Override
  public double chuVi() {
    return Math.PI * 2 * r;
  }

  @Override
  public double dienTich() {
    return Math.PI * r * r;
  }

  @Override
  public void getName() {
    System.out.println("Hinh Tròn");
  }
}
