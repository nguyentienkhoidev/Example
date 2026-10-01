package com.khoinguyen.lesson15;

public class Exeption7 {
/*
Bài 7 (Ném lỗi chủ động - throw và throws): Đăng ký tài khoản

Viết một hàm public static void registerUser(String username, String password) throws Exception.
Trong hàm kiểm tra:
Nếu username trống (isEmpty()), hãy dùng throw ném ra Exception("Tên đăng nhập không được để trống!").
Nếu password.length() < 6, hãy ném ra Exception("Mật khẩu phải từ 6 ký tự trở lên!").
Trong hàm main(), gọi hàm registerUser và dùng try-catch để hứng lỗi, in message lỗi ra màn hình cho người dùng biết.
*/

  public static void main(String[] args) {
    try {
      registerUser("khoi", "5445");
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void registerUser(String username, String password) throws Exception {
    if(username.isEmpty()) {
      throw new Exception("Tên đăng nhập không được để trống!");
    }
    if(password.length() < 6) {
      throw new Exception("Mật khẩu phải từ 6 ký tự trở lên!");
    }
  }

//  public static void main(String[] args) {
//    try {
//      int c = divide(9, 1);
//      System.out.println(c);
//    }
//    catch (ArithmeticException e) {
//      System.out.println(e.getMessage());
//    }
//  }
//
//  public static int divide(int a, int b) {
//      //ném chủ động
//    if (b == 1) {
//      throw new ArithmeticException("b khong the bang 1");
//    }
//    return a / b;
//  }

//  public static void main(String[] args) {
//    try {
//      int c = divide(9, 0);
//      System.out.println(c);
//    }
//    catch (ArithmeticException e) {
//      System.out.println(e.getMessage());
//    }
//  }
//
//  public static int divide(int a, int b) throws ArithmeticException {
//    return a / b;
//  }
}
