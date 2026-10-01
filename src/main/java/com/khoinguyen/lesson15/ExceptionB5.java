package com.khoinguyen.lesson15;

public class ExceptionB5 {
/*
Bài 5 (Bắt lỗi cơ bản): Máy tính an toàn Viết hàm public static void divide(int a, int b).
Trong hàm, thực hiện phép chia a / b và in ra kết quả.
Bọc phép chia trong khối try-catch. Bắt lỗi ArithmeticException (lỗi chia cho 0) và in ra câu thông báo: "Lỗi: Không thể chia cho 0!".
Thêm khối catch(Exception e) ở dưới để bắt các lỗi không lường trước.
Ở khối finally, in ra dòng chữ: "Kết thúc phép tính."
* */
  public static void main(String[] args) {
    divide(9, 3);
  }

  public static void divide(int a, int b) {
    int[] arr = new int[5];
    try {
      int c = a / b;
      System.out.println("success");
    }
    catch (ArithmeticException e) {
      System.out.println("Lỗi: Không thể chia cho 0!");
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
    finally {
      System.out.println("Kết thúc phép tính.");
    }
  }
}
