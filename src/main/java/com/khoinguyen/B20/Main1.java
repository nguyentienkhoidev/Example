package com.khoinguyen.B20;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main1 {

  public static void unaryOperator(UnaryOperator<Integer> unaryOperator) {
    unaryOperator.apply(1);
    String input = " Tôi là 1 pro player of java develop ";
    List<UnaryOperator<String>> pipeline = Arrays.asList(
        String::trim,                           // 1. Cắt khoảng trắng 2 đầu
        String::toUpperCase,                    // 2. Viết hoa toàn bộ
        s -> s.replace("JAVA", "JAVA 8+")       // 3. Thay thế "JAVA" thành "JAVA 8+"
    );

    // Duyệt qua danh sách và áp dụng tuần tự từng bước lên chuỗi
    String result = input;
    for (UnaryOperator<String> operation : pipeline) {
      result = operation.apply(result);
    }

    // In kết quả để kiểm chứng
    System.out.println("Chuỗi ban đầu: '" + input + "'");
    System.out.println("Chuỗi sau khi xử lý: '" + result + "'");
  }

  public static void main(String[] args) {
    String input = "   Tôi là 1 pro player of java develop    ";
    String result = unaryOperator(input);
    System.out.println(result);
  }

  public static String stream(String input) {
    /*
    Cắt khoảng trắng 2 đầu (String::trim).
    Viết hoa toàn bộ chuỗi (String::toUpperCase).
    Thay thế "JAVA" thành "JAVA 8+".
    * */

    String result = "";
    //việc 1
    result = input.trim();
    //việc 2
    result = result.toUpperCase();
    //việc 3
    result = result.replace("JAVA", "JAVA 8+");

    return result;
  }

  public static String unaryOperator(String input) {
    List<UnaryOperator<String>> pipelines = Arrays.asList(
        String::trim,                           // 1. Cắt khoảng trắng 2 đầu
        String::toUpperCase,                    // 2. Viết hoa toàn bộ
        s -> s.replace("JAVA", "JAVA 8+")       // 3. Thay thế "JAVA" thành "JAVA 8+" //cutomer
    );

    // Duyệt qua danh sách và áp dụng tuần tự từng bước lên chuỗi
    String result = input;
    for (UnaryOperator<String> operation : pipelines) {// 1 - 2 - 3
      result = operation.apply(result);
    }

    return result;
  }

}
