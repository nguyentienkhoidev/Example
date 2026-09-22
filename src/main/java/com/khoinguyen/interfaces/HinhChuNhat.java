package com.khoinguyen.interfaces;

public class HinhChuNhat implements IHinh {
  private int canhDai;
  private int canhNgan;

  public HinhChuNhat() {
  }

  public HinhChuNhat(int canhDai, int canhNgan) {
    this.canhDai = canhDai;
    this.canhNgan = canhNgan;
  }

  public int getCanhDai() {
    return canhDai;
  }

  public void setCanhDai(int canhDai) {
    this.canhDai = canhDai;
  }

  public int getCanhNgan() {
    return canhNgan;
  }

  public void setCanhNgan(int canhNgan) {
    this.canhNgan = canhNgan;
  }

  @Override
  public double chuVi() {
    return (canhDai + canhNgan) * 2;
  }

  @Override
  public double dienTich() {
    return canhDai * canhNgan;
  }

  @Override
  public void getName() {
    System.out.println("Hinh Chu Nhat");
  }
}
