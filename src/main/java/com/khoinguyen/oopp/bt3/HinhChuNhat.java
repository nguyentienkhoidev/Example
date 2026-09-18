package com.khoinguyen.oopp.bt3;

public class HinhChuNhat {
  private int canhDai;
  private int canhNgan;

  public HinhChuNhat(int canhDai, int canhNgan) {
    this.canhDai = canhDai;
    this.canhNgan = canhNgan;
  }

  public HinhChuNhat() {
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
  public String toString() {
    return "HinhChuNhat{" + "canhDai=" + canhDai + ", canhNgan=" + canhNgan + '}';
  }

  public int tinhDienTich() {
    System.out.println("Tinh dien tich hinh nhat");
    return canhDai * canhNgan;
  }

  public int tinhChuVi() {
    System.out.println("Tinh chu vi hinh nhat");
    return (canhNgan + canhDai) * 2;
  }
}
