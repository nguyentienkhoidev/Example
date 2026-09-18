package com.khoinguyen.oopp.bt3;

public class HinhVuong extends HinhChuNhat {
  //1 canh
  int canh;

  public HinhVuong(int canh) {
    super(canh, canh);
    this.canh = canh;
  }

  public HinhVuong() {}

  public int getCanh() {
    return canh;
  }

  public void setCanh(int canh) {
    this.canh = canh;
  }
//customer lại
  @Override
  public int tinhDienTich() {
    System.out.println("Tinh dien tich hinh vuong");
    return canh * canh;
  }

  public int tinhChuVi() {
    System.out.println("Tinh chu vi hinh vuong");
    return canh * 4;
  }

  public void hinhVuongx() {
    System.out.println("Tinh vuong hinh vuong");
  }
}
