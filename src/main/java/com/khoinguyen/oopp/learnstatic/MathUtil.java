package com.khoinguyen.oopp.learnstatic;

public class MathUtil {
  public static int[] arr = new int[] {1, 3, 4, 5};

  public static void change(int viTri, int value) {
    arr[viTri] = value;
  }

  public static void mul(int viTri, int value) {
    arr[viTri] = value * value;
  }

  public static void print() {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public void printt() {
    System.out.println("");
  }//instance = non static

  public static void main(String[] args) {
    MathUtil.print();

    change(0, 10);
//    print();
    mul(1, 2);
    print();

    //cong thuc giai thua => sử udngj chung
  }
}
