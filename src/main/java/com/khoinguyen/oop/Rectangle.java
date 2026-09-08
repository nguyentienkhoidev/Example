package com.khoinguyen.oop;

public class Rectangle {
  double chieuDai;
  double chieuRong;

  public Rectangle() {}

  public Rectangle(double chieuDai, double chieuRong) {
    this.chieuDai = chieuDai;
    this.chieuRong = chieuRong;
  }

  //dien tich, chu vi
  //viet method tinh dien tich, chu vi 1 hinh chu nhat
  public double tinhDienTich() {
    return chieuDai * chieuRong;
  }

  public double tinhChuVi() {
    return (chieuDai + chieuRong) * 2;
  }

  public static void main(String[] args) {
//    Rectangle rectangle = new Rectangle(10, 5);
//    System.out.println(rectangle.chieuDai + " " + rectangle.chieuRong);

//    Rectangle rectangle2 = new Rectangle();
//    rectangle.chieuDai = 20;
//    rectangle.chieuRong = 10;
//
//    System.out.println(rectangle.chieuDai + " " + rectangle.chieuRong);

    Rectangle rectangle1 = new Rectangle(40, 30);
    Rectangle rectangle2 = new Rectangle(60, 30);
    double dienTich = rectangle1.tinhDienTich();
    double chuViTich = rectangle1.tinhChuVi();

    System.out.printf("[%s, %s], Dien tich: %s, Chu vi la: %s", rectangle1.chieuDai, rectangle1.chieuRong, dienTich, chuViTich);
  }
}
