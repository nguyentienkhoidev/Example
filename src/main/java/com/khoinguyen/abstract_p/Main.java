package com.khoinguyen.abstract_p;

public class Main {

  public static void main(String[] args) {
    TamGiac tamGiac = new TamGiac(3, 5, 6);
    System.out.println(tamGiac.dienTich());

    Hinh tron = new HinhTron(5);

    HinhTron tron2 = new HinhTron(5);
    tron2.getR();
  }
}
