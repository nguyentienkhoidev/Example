package com.khoinguyen.interfaces;

public class Main {

  public static void main(String[] args) {
    HinhChuNhat hinhChuNhat = new HinhChuNhat(4, 5);
    System.out.println(hinhChuNhat.dienTich());

    IHinh hcn = new HinhChuNhat(8, 9);
    System.out.println(hcn.dienTich());
  }
}
