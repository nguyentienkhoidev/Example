package com.khoinguyen.oop_bt.bt2;

public class NhanVienFullTime extends NhanVien {
  private double thuong;

  public NhanVienFullTime() {
  }

  public NhanVienFullTime(String ten, double luongCoBan, double thuong) {
    super(ten, luongCoBan);
    this.thuong = thuong;
  }

  public double getThuong() {
    return thuong;
  }

  public void setThuong(double thuong) {
    this.thuong = thuong;
  }

  @Override
  public double tinhLuong() {
    return luongCoBan + thuong;
  }
}
