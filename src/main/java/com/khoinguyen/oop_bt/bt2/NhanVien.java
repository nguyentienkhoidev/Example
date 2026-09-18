package com.khoinguyen.oop_bt.bt2;

public class NhanVien {
  protected String ten;
  protected double luongCoBan;

  public NhanVien() {
  }
  public NhanVien(String ten, double luongCoBan) {
    this.ten = ten;
    this.luongCoBan = luongCoBan;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public double getLuongCoBan() {
    return luongCoBan;
  }

  public void setLuongCoBan(double luongCoBan) {
    this.luongCoBan = luongCoBan;
  }

  public double tinhLuong() {
    return luongCoBan;
  }

  public void hienThiThongTin() {
    System.out.printf("ten: %s, tinhLuong: %f\n", ten, tinhLuong());
  }
}
