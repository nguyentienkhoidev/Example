package com.khoinguyen.oopp.learnstatic;

public class Main {
  int a = 5;//instance
  static int b = 6;


  public static void main(String[] args) {
//    change1();
//    change2();

//    Main m = new Main();
//    m.b = 10;
//
//    Main m2 = new Main();
//    System.out.println(m2.b);

    double c = Math.pow(4, 2);
  }

  public static void change1() {
    b = 7;
  }

  public static void change2() {
    b = 8;
  }
}
