package com.khoinguyen.lesson15;

public class StringB2 {
/*
Bài 2 (Thao tác nâng cao với String): Tìm kiếm và Cắt ghép Cho chuỗi: String email = "nguyen.van.a@tayjava.vn";

Kiểm tra email có chứa chuỗi "@tayjava" hay không (dùng contains()).
Tìm vị trí xuất hiện đầu tiên của ký tự @ (dùng indexOf()).
Cắt lấy phần "username" (phía trước @) và phần "domain" (phía sau @) (dùng substring()).
Thay thế đuôi .vn thành .com (dùng replace()).
Tách phần username "nguyen.van.a" thành một mảng các chuỗi, phân cách bởi dấu chấm . (dùng split()) và in ra từng phần tử.
So sánh biến email với một email khác là "NGUYEN.VAN.A@TAYJAVA.VN" xem có giống nhau không (bỏ qua viết hoa/thường dùng equalsIgnoreCase()).
* */
  public static void main(String[] args) {
//    String email = "nguyen.van.a@tayJava.vn@";
//    System.out.println(email.toUpperCase().contains("@tayJava".toUpperCase()));
    //Tìm vị trí xuất hiện đầu tiên của ký tự @ (dùng indexOf()).
//    System.out.println(email.indexOf('@'));

    //danh các vị tri xuat hịen @
//    String result = "";
//    int index = 0;
//    for (char c : email.toCharArray()) {
//      if(c == '@') {
//        result += index+" ";
//      }
//      index++;
//    }
//    System.out.println(result);

//    String result = "";
//    for (int i = 0; i < email.length(); i++) {
//      if(email.charAt(i) == '@') {
//        result += i+" ";
//      }
//    }
//    System.out.println(result);
//    String email = "nguyen.van.a@tayJava.vn";
    //Cắt lấy phần "username" (phía trước @) và phần "domain" (phía sau @) (dùng substring()).
//    int index = email.indexOf('@');
//    String username = email.substring(0, index);
//    System.out.println(username);
//
//    String domain = email.substring(index);
//    System.out.println(domain);

    //Thay thế đuôi .vn thành .com (dùng replace()).
//      String result = email.replace(".vn", ".com");
//      System.out.println(result);

    //Tách phần username "nguyen.van.a" thành một mảng các chuỗi, phân cách bởi dấu chấm . (dùng split()) và in ra từng phần tử.
//    String username = "nguyen.van.a";
//    String[] arr = username.split("\\.");
//    for (int i = 0; i < arr.length; i++) {
//      System.out.println(arr[i]);
//    }

    //So sánh biến email với một email khác là "NGUYEN.VAN.A@TAYJAVA.VN" xem có giống nhau không (bỏ qua viết hoa/thường dùng equalsIgnoreCase()).
    String email = "nguyen.van.a@tayJava.vn";
    String emailOther = "NGUYEN.VAN.A@TAYJAVA.VN";

    boolean isCheck = email.equalsIgnoreCase(emailOther);
    System.out.println(isCheck);

  }
}
