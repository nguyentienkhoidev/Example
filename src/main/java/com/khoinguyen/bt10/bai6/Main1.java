package com.khoinguyen.bt10.bai6;

public class Main1 {
  public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
  }

  public static void main(String[] args) {
    int a = 1;
    int b = 2;

    swap(a, b);

    System.out.println("a = "+a+" b = "+b);

  }
}
