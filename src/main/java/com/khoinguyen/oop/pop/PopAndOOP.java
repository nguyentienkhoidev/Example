package com.khoinguyen.oop.pop;

public class PopAndOOP {
  static double account1 = 10000;
  static double account2 = 20000;

  static void rutTien1(double money) {
    account1 = account1 - money;
    System.out.printf("Ban vua rut: %s dong, tai khoan 1 con lai: %s", money, account1);
  }

  static void rutTien2(double money) {
    account2 = account2 - money;
    System.out.printf("Ban vua rut: %s dong, tai khoan 2 con lai: %s", money, account2);
  }

  public static void main(String[] args) {
    rutTien1(1000);
    rutTien2(1000);
  }
}
