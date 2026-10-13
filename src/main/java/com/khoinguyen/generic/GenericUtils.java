package com.khoinguyen.generic;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class GenericUtils {

  //biến đổi nó param linh hoạt
  public static <T> List<T> filter(List<T> list, Predicate<T> condition) {//TEMPLATE JAVA
    return list.stream()
        .filter(condition) //lambda expression nào làm được điều nhận vào item -> boolean
        .toList();
  }

  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    Predicate<Integer> predicate = x -> x % 2 != 0;
    List<Integer> result = filter(list, predicate);
    System.out.println(result);
  }

  //cái kiến thức này: 1 năm đi làm sẽ thấm

  // Hàm lọc đa năng: Dùng cho List<Integer>, List<String>, List<Student>,...
  public static <T> List<T> filterBy(List<T> list, Predicate<T> condition) {
    return list.stream()
        .filter(condition)
        .collect(Collectors.toList());
  }

  // Hàm biến đổi đa năng: Biến List<T> thành List<R>
  public static <T, R> List<R> transformList(List<T> list, Function<T, R> transformer) {
    return list.stream()
        .map(transformer)
        .collect(Collectors.toList());
  }

//  public static void main(String[] args) {
//    // Lọc số chẵn
//    List<Integer> evens = filterBy(List.of(1, 2, 3, 4, 5), n -> n % 2 == 0);
//    System.out.println(evens); // [2, 4]
//
//    // Lọc chuỗi dài hơn 4 ký tự
//    List<String> longWords = filterBy(
//        List.of("Java", "Spring", "Boot", "Microservices"),
//        s -> s.length() > 4
//    );
//    System.out.println(longWords); // [Spring, Microservices]
//
//    // Biến đổi: List tên → List độ dài
//    List<Integer> lengths = transformList(
//        List.of("Java", "Spring", "Boot"),
//        String::length
//    );
//    System.out.println(lengths); // [4, 6, 4]
//  }
}
