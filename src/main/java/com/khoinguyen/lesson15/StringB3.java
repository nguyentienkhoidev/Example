package com.khoinguyen.lesson15;

public class StringB3 {
  /*
Bài 3 (Xử lý chuỗi tốc độ cao): Tạo mã đơn hàng
Viết một hàm public static String generateOrderCode(String prefix, int count) để sinh ra một chuỗi mã đơn hàng ghép từ nhiều phần.
Khởi tạo một StringBuilder với giá trị là prefix.
Dùng vòng lặp for lặp count lần, mỗi lần nối thêm (dùng append()) một chuỗi là "-ORD" + i.
Sau khi vòng lặp kết thúc, hãy chèn chuỗi "-[VIP]" vào vị trí ngay sau prefix (dùng insert()).
Cuối cùng, trả về chuỗi hoàn chỉnh bằng toString().
  */
  public static void main(String[] args) {
    String code = generateOrderCode("OKELA", 4);
    System.out.println(code);
  }

  public static String generateOrderCode(String prefix, int count) {
    StringBuilder builder = new StringBuilder(prefix);
    for (int i = 1; i <= count; i++) {
      builder.append("-ORD" + i);
    }
    builder.insert(prefix.length(), "-[VIP]");
    return builder.toString();
  }
}
