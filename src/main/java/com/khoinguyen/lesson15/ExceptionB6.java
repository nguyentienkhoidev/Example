package com.khoinguyen.lesson15;

import java.util.Scanner;

public class ExceptionB6 {
/*
Bài 6 (Bắt lỗi khi ép kiểu): Nhập số từ bàn phím

Dùng Scanner để yêu cầu người dùng nhập vào một chuỗi thay vì nhập số (dùng nextLine()).
Dùng Integer.parseInt(chuỗi) để ép kiểu chuỗi vừa nhập thành một số nguyên.
Nếu người dùng nhập chữ (ví dụ: "abc"), Java sẽ ném ra lỗi NumberFormatException. Hãy bọc try-catch để bắt lỗi này và thông báo "Bạn phải nhập một số hợp lệ!".
* */
  public static void main(String[] args) {
    //nhap toi bao gio dung dinh dang thi thoi
    Scanner sc = new Scanner(System.in);
    boolean isSuccess = false;

    while (!isSuccess) {
      try {
        System.out.print("Input a number: ");
        int count = Integer.parseInt(sc.nextLine());
        System.out.println(count);

        isSuccess = true;
      } catch (NumberFormatException e) {
        System.out.println("Bạn phải nhập một số hợp lệ!");
      }
    }
  }
}
