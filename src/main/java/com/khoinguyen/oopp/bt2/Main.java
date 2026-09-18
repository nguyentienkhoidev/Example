package com.khoinguyen.oopp.bt2;

public class Main {

  public static void main(String[] args) {
    Plus plus = new Plus();
    //ĐA HÌNH OVERLOADING: NẠP CHỒNG
    System.out.println(plus.add(10, 20));
    System.out.println(plus.add(10.5, 20));
    System.out.println(plus.add(10, 20, 40));


  }
}
