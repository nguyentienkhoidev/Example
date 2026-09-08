package com.khoinguyen.array.homework;

public class GiaiThua {
  public static int gt(int n) {
    if(n == 0) return 1;
    if(n == 1) return 1;
    return n * gt(n - 1);
  }

  public static void main(String[] args) {
    int s = gt(5);
    System.out.println(s);
  }
}
