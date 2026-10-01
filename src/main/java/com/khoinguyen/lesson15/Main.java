package com.khoinguyen.lesson15;

import com.sun.security.jgss.GSSUtil;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {

  public static void main(String[] args) {
    String trimmed = "  Hello Java World!  ".trim();

    // 3. charAt(int index): Lấy ký tự tại một vị trí
//    String trimmed = text.trim(); // "Hello Java World!"
//    char c = trimmed.charAt(6); // 'H'
//    System.out.println(c);
//    System.out.println(text);
//    System.out.println(trimmed);

    // 1. length(): Lấy độ dài chuỗi
//    int len = text.length(); // 21
//    System.out.println(len);

    // 4. substring(int beginIndex, int endIndex): Cắt chuỗi con
// (Lấy từ beginIndex đến sát endIndex - 1)
//    System.out.println(trimmed);
//    String sub = trimmed.substring(6, 10); // "Java" >= vị trí đầu và nhỏ hơn vị trị end
//    System.out.println(sub);

//    String name = "Iam Khoi Iam";
//    System.out.println(name);
//    System.out.println(name.replace("Iam", "I"));

//    System.out.println(trimmed);
//    int index = trimmed.indexOf("Java");// vị tri xuat hien dau tien trong strubg
//    System.out.println(index);

//    System.out.println("aaaaa".toUpperCase());//class object

//    boolean empty = "".isEmpty(); // true (độ dài = 0) 0
//    System.out.println(empty);
//    boolean blank = "   ".isBlank(); // true (chỉ chứa khoảng trắng)
//    System.out.println(blank);

//    String a = "Java";
//    a = a + " core";
//    System.out.println(a);

//    StringBuilder sb = new StringBuilder("java");
//    sb.append(" core");
//    System.out.println(sb);

//    StringBuilder sb = new StringBuilder("Hello"); // => String sb = "Hello"
//
//// 1. Nối thêm vào cuối (Rất nhanh)
//    sb.append(" World"); // "Hello World"
//    sb.append(2024);     // "Hello World2024"
//
//// 2. Chèn vào vị trí bất kỳ
//    sb.insert(5, " Java"); // "Hello Java World2024"
//    System.out.println(sb);
//// 3. Xóa đoạn chuỗi
//    sb.delete(5, 10);
//    System.out.println(sb);
//// 4. Đảo ngược chuỗi (Thường dùng trong thuật toán)
//    sb.reverse();
//    System.out.println(sb);
//// 5. Chuyển ngược lại thành String (Bắt buộc phải làm khi muốn gán vào biến String)
//    String finalString = sb.toString();
//    System.out.println(finalString);

    // Khởi tạo StringJoiner
    // Cú pháp: StringJoiner(delimiter, prefix, suffix)
//    StringJoiner sj = new StringJoiner("+", "=>>>", "<<<====");
//
//    sj.add("Apple");
//    sj.add("Banana");
//    sj.add("Orange");
//    sj.add("43543534");

//    System.out.println(sj.toString());
    // Kết quả: [Apple, Banana, Orange]
    // (Rất tiện lợi khi định dạng chuỗi JSON hoặc mảng!)

//    boolean a = true;
//    Boolean b = new Boolean(a); //boxing
//    boolean c = b;
//    System.out.println(b);

//    System.out.println(Integer.max(3, 5));

    int b = 10;

    devide(b);

    System.out.println("hello world");
  }


  public static void devide(int s) {
    int a = 0;
    String status = "";

    try {
      a = a/s;
      status = "ngon";
    }
    catch (Exception e) {
      System.out.println("loi");
      status = "ko ngon";
      a = 5;
    }
    finally {
      System.out.println("hoan thanh");
      System.out.println(status);
    }

    System.out.println("a = "+5);
  }
}
