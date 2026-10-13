package com.khoinguyen.lab.util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Validation {
  private static final Scanner scanner = new Scanner(System.in);

  public static int getInt(String message, int min, int max) {
    while (true) {
      try {
        System.out.print(message);
        String input = scanner.nextLine().trim();
        int number = Integer.parseInt(input);
        if (number >= min && number <= max) {
          return number;
        }
        System.out.printf("Vui lòng nhập số trong khoảng [%d, %d]!\\n", min, max);
      } catch (NumberFormatException e) {
        System.out.println("Giá trị không hợp lệ! Vui lòng nhập số nguyên.");
      }
    }
  }

  public static String getString(String message) {
    while (true) {
      System.out.print(message);
      String input = scanner.nextLine().trim();
      if (!input.isEmpty()) {
        return input;
      }
      System.out.println("Dữ liệu không được để trống! Vui lòng nhập lại.");
    }
  }

  public static String getDate(String message) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    sdf.setLenient(false);
    while (true) {
      System.out.print(message);
      String input = scanner.nextLine().trim();
      try {
        sdf.parse(input);//55-55-5555
        return input;
      } catch (Exception e) {
        System.out.println("Ngày không hợp lệ! Vui lòng nhập theo định dạng dd-MM-yyyy.");
      }
    }
  }

  public static double getPlanTime(String message) {
    while (true) {
      try {
        System.out.print(message);
        String input = scanner.nextLine().trim();
        double val = Double.parseDouble(input);
        if (val >= 8.0 && val <= 17.5 && val % 0.5 == 0) {
          return val;
        }
        System.out.println("Thời gian phải từ 8.0 đến 17.5 và chia hết cho 0.5 (8.0, 8.5, 9.0...)!");
      } catch (NumberFormatException e) {
        System.out.println("Vui lòng nhập một số thực hợp lệ!");
      }
    }
  }

  public static void main(String[] args) {
    int a = getInt("You can input a number: ", 4, 10);
    System.out.println(a);
  }
}
