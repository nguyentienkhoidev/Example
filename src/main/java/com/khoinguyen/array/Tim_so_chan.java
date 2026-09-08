package com.khoinguyen.array;

public class Tim_so_chan {
  public static void main(String[] args) {
    int[] array = new int[]{2, 3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 1, 44, 55, 66};
    for (int i = 0; i < array.length;i++) {
      int count = 0;
      for (int j = 0; j < array.length;j++) {
        if (array[j] == array[i]) {
          count++;
        }

      }
      System.out.println(array[i] + "Xuất hiện " + count + "Lần" );
    }


  }
}
