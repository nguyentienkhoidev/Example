package com.khoinguyen.array;

public class ArrayDuplicate {

  public static void main(String[] args) {
    int[] array = new int[]{2, 3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 1, 44, 55, 66, 1, 1};
    boolean[] visit = new boolean[array.length];
    //visit = new int[]{2, 3, 4, 5, 6, 7, 8, true, true, true, true, 1, 44, 55, 66, true, true};
    for (int i = 0; i < array.length; i++) {
      if(visit[i]) {
        continue;
      }
      int count = 1;
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          visit[j] = true;
          count++;
        }
      }
      System.out.printf("Lan xuat hien cua so %s la %s \n", array[i], count);
    }
  }
}
