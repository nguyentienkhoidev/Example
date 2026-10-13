package com.khoinguyen.B20;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {

  public static void main(String[] args) {
    String text = "java jtream API is elegant, declarative and extremely powerful!";
    main54();

    /**
     màu đỏ 10 cái
     xanh   10 cái
     tím 10 cái

     vàng 20
     đen 20
     tím 50

     bao nhiêu loại áo
     xanh: 4
     tím: 5
     vàng: 5
     */
  }

  public static void main54() {
    String text = "Java Stream API is elegant, declarative and extremely powerful!";

    // 1. Chuyển đổi text thành Map tần suất các chữ cái (bỏ khoảng trắng và dấu câu)
    Map<Character, Long> frequencyMap = text.chars()
        .filter(Character::isLetter)                         // Chỉ giữ lại chữ cái a-z
        .mapToObj(c -> (char) Character.toLowerCase(c))     // Đưa về chữ thường
        .collect(Collectors.groupingBy(
            Function.identity(),                         // Key: chính ký tự đó
            Collectors.counting()                        // Value: số lần xuất hiện
        ));

    System.out.println("Bảng thống kê tần suất ký tự: " + frequencyMap);


    // 2. Tìm Entry có số lần xuất hiện (Value) lớn nhất
    Map.Entry<Character, Long> mostFrequent = frequencyMap.entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .orElse(null);
    //1 thăngf max (key, value)

    if (mostFrequent != null) {
      System.out.printf("\nKý tự xuất hiện nhiều nhất: '%c' với %d lần xuất hiện.\n",
          mostFrequent.getKey(), mostFrequent.getValue());
    }
  }
}
