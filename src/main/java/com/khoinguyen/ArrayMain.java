package com.khoinguyen;

import com.khoinguyen.oopp.Student;

public class ArrayMain {

  public static void main(String[] args) {
    Student s1 = new Student();

    //mảng 2 chiều
    int[][] xArr = new int[3][5];
    xArr[0][0] = 5;
    xArr[0][1] = 12;
    xArr[0][2] = 17;
    xArr[0][3] = 9;
    xArr[0][4] = 3;

    xArr[1][0] = 13;
    xArr[1][1] = 4;
    xArr[1][2] = 8;
    xArr[1][3] = 14;
    xArr[1][4] = 1;

    xArr[2][0] = 9;
    xArr[2][1] = 6;
    xArr[2][2] = 3;
    xArr[2][3] = 7;
    xArr[2][4] = 21;

    System.out.println("xArr.length: "+xArr.length);
    for (int i = 0; i < xArr.length; i++) {
      //xArr[0]
      for (int j = 0; j < xArr[i].length; j++) {
        System.out.print(xArr[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public static void fun() {
    int[] xArr = new int[3];
    for (int i = 0; i < xArr.length; i++) {
      System.out.println(xArr[i]);
    }
  }
}
