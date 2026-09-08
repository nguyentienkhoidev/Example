package com.khoinguyen.array;

public class IgnoreDuplicateData {
  public static void main(String[] args) {

    int[] arr = {4, 2, 4, 5, 2, 3, 1, 5, 9};

    int[] result = new int[arr.length];
    int count = 0;

    for (int i = 0; i < arr.length; i++) {

      boolean isDuplicate = false;

      // Kiểm tra arr[i] đã có trong result chưa
      for (int j = 0; j < count; j++) {
        if (arr[i] == result[j]) {
          isDuplicate = true;
          break;
        }
      }

      // Nếu chưa có thì thêm vào result
      if (!isDuplicate) {
        result[count] = arr[i];
        count++;
      }
    }

    // In kết quả
    for (int i = 0; i < count; i++) {
      System.out.print(result[i] + " ");
    }
  }
}