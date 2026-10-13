package com.khoinguyen.method_reference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

  public static void main(String[] args) {
    //Loại 1
    Function<String, Integer> parser = Integer::parseInt; // "5" => 5
    System.out.println(parser.apply("123"));
    //có sự tương đồng đầu vào đầu ra + hàm đó là static (parseInt)

//    Function<String, Integer> parser = Integer::parseInt;
//    System.out.println(parser.apply("123"));

    //Loại 2
    Consumer<String> printer = System.out::println;
    printer.accept("Hello"); // Hello

    Function<String, String> upper = String::toUpperCase;
    System.out.println(upper.apply("hello")); // HELLO

    //viết thư viên cần độ ngắn gọn, nhanh: viếit code người khách iểu
  }
}
