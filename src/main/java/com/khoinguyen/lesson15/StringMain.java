package com.khoinguyen.lesson15;

public class StringMain {

  /*
  Bài 1 (Khởi động với String): Phân tích chuỗi cơ bản Cho một chuỗi văn bản:
  String data = "   Java Core, Spring Boot, Hibernate, Microservices!  "; Hãy thực hiện lần lượt các thao tác sau và in kết quả ra màn hình:
  Xóa khoảng trắng thừa ở 2 đầu chuỗi (dùng trim()).
  Kiểm tra xem chuỗi có trống hay rỗng không (dùng isEmpty() và isBlank()).
  Lấy độ dài của chuỗi sau khi đã trim (dùng length()).
  Chuyển toàn bộ chuỗi sang chữ HOA (dùng toUpperCase()).
  Chuyển toàn bộ chuỗi sang chữ thường (dùng toLowerCase()).
  Kiểm tra xem chuỗi có bắt đầu bằng chữ "java" (phân biệt hoa thường) và kết thúc bằng dấu ! không? (dùng startsWith() và endsWith()).
  Lấy ký tự tại vị trí thứ 5 (dùng charAt()).

  * */
  public static void main(String[] args) {
    String data = "   Java Core, Spring Boot, Hibernate, Microservices!  ";
    System.out.printf("Data original: |%s|\n",data);
//    String dataTrim = data.trim();
//    System.out.printf("trim procces: |%s|", dataTrim);

//    String data1 = ""; // rỗng "" 0 space ||| blank: nhiều khoảng trắng (0 -  n) space
//    System.out.println(data1.isBlank());

//    int size = data.trim().length();
//    System.out.println(size);

    //Chuyển toàn bộ chuỗi sang chữ HOA (dùng toUpperCase()).
//    String upper = data.toLowerCase();
//    System.out.println(upper);

    //Kiểm tra xem chuỗi có bắt đầu bằng chữ "java" (phân biệt hoa thường) và kết thúc bằng dấu ! không? (dùng startsWith() và endsWith()).
    data = data.trim();
//    data = data.toLowerCase();
//    System.out.println(data.startsWith( "JAvA".toLowerCase() ));// khong phan biet hoa t

//    boolean isCheck = data.startsWith("Java") && data.endsWith("!");
//    System.out.println(isCheck);

    //  Lấy ký tự tại vị trí thứ 5 (dùng charAt()).
    System.out.println(data.charAt(4));







  }
}
